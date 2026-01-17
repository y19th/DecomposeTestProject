package com.y19th.decomposetestproject.forgot_password.ui

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.ComponentContext
import com.y19th.dextension.koin.KoinScreen
import com.y19th.dextension.koin.getComponent

interface ForgotPasswordScreen : KoinScreen

internal class ForgotPasswordScreenImpl(
    mail: String,
    override val componentContext: ComponentContext
) : ForgotPasswordScreen {

    private val component: ForgotPasswordComponent = getComponent(componentContext, mail)

    @Composable
    override fun Content() {
        ForgotPasswordContent(component)
    }
}