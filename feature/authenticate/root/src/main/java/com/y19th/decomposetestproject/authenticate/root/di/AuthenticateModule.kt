package com.y19th.decomposetestproject.authenticate.root.di

import com.y19th.decomposetestproject.authenticate.root.ui.AuthenticateComponent
import com.y19th.decomposetestproject.authenticate.root.ui.AuthenticateScreen
import com.y19th.decomposetestproject.authenticate.root.ui.AuthenticateScreenImpl
import com.y19th.decomposetestproject.forgot_password.di.forgotPasswordModule
import com.y19th.decomposetestproject.main.di.mainModule
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module

val authenticateModule = module {
    includes(mainModule, forgotPasswordModule)
    factoryOf(::AuthenticateComponent)
    factoryOf(::AuthenticateScreenImpl).bind<AuthenticateScreen>()
}