package com.y19th.decomposetestproject.navigation.event

import com.y19th.dextension.core.ComponentEvent

sealed class SheetEvent: ComponentEvent {

    data object Dismiss : SheetEvent()

    data class Confirm(val value: String) : SheetEvent()
}