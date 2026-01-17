package com.y19th.decomposetestproject.forgot_password.ui

import com.arkivanov.decompose.ComponentContext
import com.y19th.decomposetestproject.forgot_password.logic.ForgotPasswordEvents
import com.y19th.decomposetestproject.forgot_password.logic.ForgotPasswordState
import com.y19th.decomposetestproject.navigation.event.ForgotPasswordBackEvent
import com.y19th.decomposetestproject.navigation.navigators.authenticate.AuthenticateNavigator
import com.y19th.dextension.core.ScreenComponent

internal class ForgotPasswordComponent(
    componentContext: ComponentContext,
    mail: String,
    private val authenticateNavigator: AuthenticateNavigator,
) : ScreenComponent<ForgotPasswordState, ForgotPasswordEvents>(
    componentContext = componentContext,
    initialState = ForgotPasswordState(mail)
) {
    override fun handleEvent(event: ForgotPasswordEvents) {
        when (event) {
            ForgotPasswordEvents.OnNavigateBack -> {
                authenticateNavigator.pop()
            }

            ForgotPasswordEvents.OnCallbackExecuted -> {
                storage.handle(ForgotPasswordBackEvent())
                authenticateNavigator.pop()
            }
        }
    }
}