package com.y19th.decomposetestproject.root.di

import com.y19th.decomposetestproject.authenticate.root.di.authenticateModule
import com.y19th.decomposetestproject.root.ui.RootComponent
import com.y19th.decomposetestproject.root.ui.RootScreen
import com.y19th.decomposetestproject.root.ui.RootScreenImpl
import com.y19th.decomposetestproject.splash.di.splashModule
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module

val rootModule = module {
    includes(splashModule, authenticateModule)
    factoryOf(::RootComponent)
    factoryOf(::RootScreenImpl).bind<RootScreen>()
}