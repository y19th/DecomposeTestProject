package com.y19th.decomposetestproject.forgot_password.logic

import com.y19th.dextension.core.BaseState

internal data class ForgotPasswordState(
	val mail: String,
): BaseState