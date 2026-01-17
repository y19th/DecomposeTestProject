package com.y19th.decomposetestproject.root.ui

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.ComponentContext
import com.y19th.decomposetestproject.base.components.ScreenHolderChildren
import com.y19th.dextension.koin.KoinScreen
import com.y19th.dextension.koin.getComponent

interface RootScreen : KoinScreen

internal class RootScreenImpl(
    override val componentContext: ComponentContext
) : RootScreen {

    private val component: RootComponent = getComponent(componentContext)

    @Composable
    override fun Content() {
        ScreenHolderChildren(component.stack)
    }
}