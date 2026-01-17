package com.y19th.decomposetestproject.main.ui

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.slot.ChildSlot
import com.arkivanov.decompose.value.Value
import com.y19th.decomposetestproject.main.logic.MainEvents
import com.y19th.decomposetestproject.main.logic.MainState
import com.y19th.decomposetestproject.navigation.event.ForgotPasswordBackEvent
import com.y19th.decomposetestproject.navigation.event.SheetEvent
import com.y19th.decomposetestproject.navigation.navigators.authenticate.AuthenticateConfiguration.ForgotPassword
import com.y19th.decomposetestproject.navigation.navigators.authenticate.AuthenticateNavigator
import com.y19th.decomposetestproject.navigation.navigators.authenticate.sheet.SheetConfiguration
import com.y19th.decomposetestproject.sheet.ui.SheetScreen
import com.y19th.dextension.core.singleSlot
import com.y19th.dextension.koin.components.KoinScreenComponent
import com.y19th.dextension.koin.getScreen

internal class MainComponent(
    componentContext: ComponentContext,
    private val authenticateNavigator: AuthenticateNavigator,
) : KoinScreenComponent<MainState, MainEvents>(
    componentContext = componentContext,
    initialState = MainState()
) {
    private val sheetSlot = singleSlot(SheetConfiguration.serializer())
    val slot: Value<ChildSlot<*, SheetScreen>> = sheetSlot.create { configuration, context ->
        getScreen(context, configuration.mail)
    }

    init {
        handleStorageEventOnMainThread<ForgotPasswordBackEvent> {
            update { copy(email = "asd") }
        }
        handleStorageEventOnMainThread<SheetEvent> {
            when (this) {
                is SheetEvent.Confirm -> {
                    update { copy(email = value) }
                    sheetSlot.dismiss()
                }

                SheetEvent.Dismiss -> {
                    sheetSlot.dismiss()
                }
            }
        }
    }

    override fun handleEvent(event: MainEvents) {
        when (event) {
            MainEvents.OnNavigateToForgotPassword -> {
                authenticateNavigator.handleConfiguration(ForgotPassword(state.value.email))
            }

            MainEvents.OnOpenSheet -> {
                sheetSlot.activate(SheetConfiguration(state.value.email))
            }

            is MainEvents.OnEmailChanged -> {
                update { copy(email = event.newValue) }
            }

        }
    }
}