package com.y19th.decomposetestproject.main.di

import com.y19th.decomposetestproject.main.ui.MainComponent
import com.y19th.decomposetestproject.main.ui.MainScreen
import com.y19th.decomposetestproject.main.ui.MainScreenImpl
import com.y19th.decomposetestproject.sheet.di.sheetModule
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module

val mainModule = module {
    includes(sheetModule)
    factoryOf(::MainComponent)
    factoryOf(::MainScreenImpl).bind<MainScreen>()
}