package com.y19th.decomposetestproject.navigation.di

import com.y19th.decomposetestproject.navigation.navigators.authenticate.AuthenticateNavigator
import com.y19th.decomposetestproject.navigation.navigators.authenticate.AuthenticateNavigatorImpl
import com.y19th.decomposetestproject.navigation.navigators.root.RootNavigator
import com.y19th.decomposetestproject.navigation.navigators.root.RootNavigatorImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val navigationModule = module {
    singleOf(::RootNavigatorImpl).bind<RootNavigator>()
    singleOf(::AuthenticateNavigatorImpl).bind<AuthenticateNavigator>()
}