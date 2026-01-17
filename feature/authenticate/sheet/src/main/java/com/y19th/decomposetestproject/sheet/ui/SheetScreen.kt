package com.y19th.decomposetestproject.sheet.ui

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.ComponentContext
import com.y19th.dextension.koin.KoinScreen
import com.y19th.dextension.koin.getComponent

interface SheetScreen : KoinScreen

internal class SheetScreenImpl(
    override val componentContext: ComponentContext,
    mail: String,
) : SheetScreen {

    private val component: SheetComponent = getComponent(componentContext, mail)

    @Composable
    override fun Content() {
        SheetContent(component)
    }
}