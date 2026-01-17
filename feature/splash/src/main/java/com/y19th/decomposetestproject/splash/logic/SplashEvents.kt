package com.y19th.decomposetestproject.splash.logic

import com.y19th.dextension.core.BaseEvents

internal sealed interface SplashEvents : BaseEvents {

    data object OnAnimationEnd : SplashEvents
}