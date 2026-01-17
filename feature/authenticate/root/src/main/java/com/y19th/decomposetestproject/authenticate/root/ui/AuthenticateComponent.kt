package com.y19th.decomposetestproject.authenticate.root.ui

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.childStack
import com.y19th.decomposetestproject.base.components.ScreenHolder
import com.y19th.decomposetestproject.forgot_password.ui.ForgotPasswordScreen
import com.y19th.decomposetestproject.main.ui.MainScreen
import com.y19th.decomposetestproject.navigation.navigators.authenticate.AuthenticateConfiguration
import com.y19th.decomposetestproject.navigation.navigators.authenticate.AuthenticateNavigator
import com.y19th.dextension.koin.components.KoinNavigationComponent
import com.y19th.dextension.koin.getScreen

internal class AuthenticateComponent(
    componentContext: ComponentContext,
    navigator: AuthenticateNavigator,
) : KoinNavigationComponent(componentContext = componentContext) {

    val stack = childStack(
        source = navigator.navigation,
        handleBackButton = true,
        serializer = AuthenticateConfiguration.serializer(),
        initialConfiguration = AuthenticateConfiguration.Main,
        childFactory = ::childFactory
    )

    sealed class Child : ScreenHolder {

        data class Main(override val screen: MainScreen) : Child()

        data class ForgotPassword(override val screen: ForgotPasswordScreen) : Child()
    }

    private fun childFactory(
        configuration: AuthenticateConfiguration,
        context: ComponentContext,
    ): Child = when (configuration) {
        AuthenticateConfiguration.Main -> {
            Child.Main(getScreen(context))
        }
        is AuthenticateConfiguration.ForgotPassword -> {
            Child.ForgotPassword(getScreen(context, configuration.mail))
        }
    }
}