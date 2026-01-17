package com.y19th.decomposetestproject

import android.app.Application
import android.content.Context
import com.y19th.decomposetestproject.navigation.di.navigationModule
import com.y19th.decomposetestproject.root.di.rootModule
import org.koin.core.context.GlobalContext.startKoin
import org.koin.dsl.module

class MainApp : Application() {

    override fun onCreate() {
        super.onCreate()

        val contextModule = module {
            single<Context> { this@MainApp }
        }

        startKoin {
            modules(
                contextModule,
                rootModule,
                navigationModule,
            )
        }
    }

}