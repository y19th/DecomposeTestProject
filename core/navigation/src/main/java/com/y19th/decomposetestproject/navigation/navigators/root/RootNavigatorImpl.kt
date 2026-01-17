package com.y19th.decomposetestproject.navigation.navigators.root

import com.arkivanov.decompose.router.stack.navigate
import com.y19th.decomposetestproject.navigation.navigators.default.DefaultNavigator

internal class RootNavigatorImpl : RootNavigator, DefaultNavigator<RootConfiguration>() {

    override fun handleConfiguration(configuration: RootConfiguration) {
        navigation.navigate { listOf(configuration) }
    }
}
