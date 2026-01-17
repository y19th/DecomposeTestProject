package com.y19th.decomposetestproject.splash.ui

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.ComponentContext
import com.y19th.dextension.koin.getComponent
import com.y19th.dextension.koin.KoinScreen
import com.y19th.decomposetestproject.splash.ui.SplashComponent

interface SplashScreen : KoinScreen

internal class SplashScreenImpl(
    override val componentContext: ComponentContext
) : SplashScreen {

    private val component: SplashComponent = getComponent(componentContext)

    @Composable
    override fun Content() {
        SplashContent(component)
    }
}