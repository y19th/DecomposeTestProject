package com.y19th.decomposetestproject.sheet.di

import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module
import com.y19th.decomposetestproject.sheet.ui.SheetComponent
import com.y19th.decomposetestproject.sheet.ui.SheetScreen
import com.y19th.decomposetestproject.sheet.ui.SheetScreenImpl

val sheetModule = module {
    factoryOf(::SheetComponent)
    factoryOf(::SheetScreenImpl).bind<SheetScreen>()
}