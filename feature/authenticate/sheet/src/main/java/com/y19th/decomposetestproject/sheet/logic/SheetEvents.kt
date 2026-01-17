package com.y19th.decomposetestproject.sheet.logic

import com.y19th.dextension.core.BaseEvents

internal sealed interface SheetEvents : BaseEvents {

    data object OnNavigateBack : SheetEvents

    data object OnConfirmValue : SheetEvents

    data class OnMailChanged(val mail: String) : SheetEvents
}
