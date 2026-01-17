package com.y19th.decomposetestproject.splash.ui

import com.arkivanov.decompose.ComponentContext
import com.y19th.decomposetestproject.navigation.navigators.root.RootConfiguration
import com.y19th.decomposetestproject.navigation.navigators.root.RootNavigator
import com.y19th.decomposetestproject.splash.logic.SplashEvents
import com.y19th.dextension.core.EventComponent
import com.y19th.dextension.extensions.coroutine.withMain
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

internal class SplashComponent(
    componentContext: ComponentContext,
    private val navigator: RootNavigator,
) : EventComponent<SplashEvents>(
    componentContext = componentContext
) {
    override fun handleEvent(event: SplashEvents) {
        when (event) {
            SplashEvents.OnAnimationEnd -> {
                scope.launch {
                    delay(300L)
                    withMain {
                        navigator.handleConfiguration(RootConfiguration.Authenticate)
                    }
                }
            }
        }
    }
}