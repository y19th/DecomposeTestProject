package com.y19th.decomposetestproject.root.ui

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.childStack
import com.y19th.decomposetestproject.authenticate.root.ui.AuthenticateScreen
import com.y19th.decomposetestproject.base.components.ScreenHolder
import com.y19th.decomposetestproject.navigation.navigators.root.RootConfiguration
import com.y19th.decomposetestproject.navigation.navigators.root.RootNavigator
import com.y19th.decomposetestproject.splash.ui.SplashScreen
import com.y19th.dextension.koin.components.KoinNavigationComponent
import com.y19th.dextension.koin.getScreen

internal class RootComponent(
    componentContext: ComponentContext,
    navigator: RootNavigator,
) : KoinNavigationComponent(componentContext = componentContext) {

    val stack = childStack(
        source = navigator.navigation,
        handleBackButton = true,
        serializer = RootConfiguration.serializer(),
        initialConfiguration = RootConfiguration.Splash,
        childFactory = ::childFactory
    )

    sealed class Child : ScreenHolder {

        data class Splash(override val screen: SplashScreen) : Child()

        data class Authenticate(override val screen: AuthenticateScreen) : Child()
    }

    private fun childFactory(
        configuration: RootConfiguration,
        context: ComponentContext,
    ): Child = when (configuration) {
        RootConfiguration.Authenticate -> Child.Authenticate(getScreen(context))
        RootConfiguration.Splash -> Child.Splash(getScreen(context))
    }
}