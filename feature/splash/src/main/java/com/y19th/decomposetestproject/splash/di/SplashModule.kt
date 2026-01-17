package com.y19th.decomposetestproject.splash.di

import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module
import com.y19th.decomposetestproject.splash.ui.SplashComponent
import com.y19th.decomposetestproject.splash.ui.SplashScreen
import com.y19th.decomposetestproject.splash.ui.SplashScreenImpl

val splashModule = module {
    factoryOf(::SplashComponent)
    factoryOf(::SplashScreenImpl).bind<SplashScreen>()
}