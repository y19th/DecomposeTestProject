package com.y19th.decomposetestproject.forgot_password.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.y19th.decomposetestproject.forgot_password.logic.ForgotPasswordEvents
import com.y19th.decomposetestproject.ui.components.VerticalSpacer
import com.y19th.dextension.compose.collectAsImmediateState
import com.y19th.dextension.compose.rememberHandleEvents

@Composable
internal fun ForgotPasswordContent(
    component: ForgotPasswordComponent,
) {
    val state = component.state.collectAsImmediateState()
    val handleEvents = component.rememberHandleEvents()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "provided mail: ${state.value.mail}"
        )

        VerticalSpacer(16.dp)

        Button(
            onClick = { handleEvents(ForgotPasswordEvents.OnNavigateBack) }
        ) {
            Text(
                text = "navigate back"
            )
        }

        VerticalSpacer(16.dp)

        Button(
            onClick = { handleEvents(ForgotPasswordEvents.OnCallbackExecuted) }
        ) {
            Text(
                text = "execute callback"
            )
        }
    }
}