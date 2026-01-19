package com.y19th.decomposetestproject.sheet.ui

import com.arkivanov.decompose.ComponentContext
import com.y19th.decomposetestproject.navigation.event.SheetEvent
import com.y19th.decomposetestproject.sheet.logic.SheetEvents
import com.y19th.decomposetestproject.sheet.logic.SheetState
import com.y19th.dextension.core.ScreenComponent

internal class SheetComponent(
    componentContext: ComponentContext,
    mail: String,
) : ScreenComponent<SheetState, SheetEvents>(
    componentContext = componentContext,
    initialState = SheetState(mail)
) {
    override fun handleEvent(event: SheetEvents) {
        when (event) {
            SheetEvents.OnNavigateBack -> {
                pushStorageEvent(SheetEvent.Dismiss)
            }

            SheetEvents.OnConfirmValue -> {
                pushStorageEvent(SheetEvent.Confirm(state.value.mail))
            }

            is SheetEvents.OnMailChanged -> {
                update { copy(mail = event.mail) }
            }
        }
    }
}