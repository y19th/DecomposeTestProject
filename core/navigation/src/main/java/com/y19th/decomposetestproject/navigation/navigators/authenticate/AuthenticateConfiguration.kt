package com.y19th.decomposetestproject.navigation.navigators.authenticate

import kotlinx.serialization.Serializable

@Serializable
sealed class AuthenticateConfiguration {

    @Serializable
    data object Main: AuthenticateConfiguration()

    @Serializable
    data class ForgotPassword(val mail: String): AuthenticateConfiguration()
}
