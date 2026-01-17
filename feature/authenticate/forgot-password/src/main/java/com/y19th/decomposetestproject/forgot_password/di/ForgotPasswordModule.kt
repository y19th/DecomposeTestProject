package com.y19th.decomposetestproject.forgot_password.di

import com.y19th.decomposetestproject.forgot_password.ui.ForgotPasswordComponent
import com.y19th.decomposetestproject.forgot_password.ui.ForgotPasswordScreen
import com.y19th.decomposetestproject.forgot_password.ui.ForgotPasswordScreenImpl
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module

val forgotPasswordModule = module {
    factoryOf(::ForgotPasswordComponent)
    factoryOf(::ForgotPasswordScreenImpl).bind<ForgotPasswordScreen>()
}