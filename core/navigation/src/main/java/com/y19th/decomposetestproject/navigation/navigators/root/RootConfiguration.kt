package com.y19th.decomposetestproject.navigation.navigators.root

import kotlinx.serialization.Serializable

@Serializable
sealed class RootConfiguration {

    @Serializable
    data object Splash : RootConfiguration()

    @Serializable
    data object Authenticate : RootConfiguration()
}
