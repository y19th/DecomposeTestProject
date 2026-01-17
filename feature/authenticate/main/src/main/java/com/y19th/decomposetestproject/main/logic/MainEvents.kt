package com.y19th.decomposetestproject.main.logic

import com.y19th.dextension.core.BaseEvents

internal sealed interface MainEvents : BaseEvents {

    data object OnNavigateToForgotPassword : MainEvents

    data object OnOpenSheet : MainEvents

    data class OnEmailChanged(val newValue: String) : MainEvents
}