package com.y19th.decomposetestproject.forgot_password.logic

import com.y19th.dextension.core.BaseEvents
                    
internal sealed interface ForgotPasswordEvents : BaseEvents {
    
    data object OnNavigateBack: ForgotPasswordEvents

    data object OnCallbackExecuted: ForgotPasswordEvents
}