package com.y19th.decomposetestproject.authenticate.root.ui

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.ComponentContext
import com.y19th.decomposetestproject.base.components.ScreenHolderChildren
import com.y19th.dextension.koin.KoinScreen
import com.y19th.dextension.koin.getComponent

interface AuthenticateScreen : KoinScreen

internal class AuthenticateScreenImpl(
    override val componentContext: ComponentContext,
) : AuthenticateScreen {

    private val component: AuthenticateComponent = getComponent(componentContext)

    @Composable
    override fun Content() {
        ScreenHolderChildren(component.stack)
    }
}