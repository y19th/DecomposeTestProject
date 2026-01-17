package com.y19th.decomposetestproject.main.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.y19th.decomposetestproject.main.logic.MainEvents
import com.y19th.decomposetestproject.ui.components.VerticalSpacer
import com.y19th.dextension.compose.ReactOnSingleChildChange
import com.y19th.dextension.compose.collectAsImmediateState
import com.y19th.dextension.compose.rememberHandleEvents

@Composable
internal fun MainContent(
    component: MainComponent,
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
            text = "current email state: ${state.value.email}"
        )

        VerticalSpacer(4.dp)

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = state.value.email,
            onValueChange = { handleEvents(MainEvents.OnEmailChanged(it)) }
        )

        VerticalSpacer(16.dp)

        Button(
            onClick = {
                handleEvents(MainEvents.OnNavigateToForgotPassword)
            }
        ) {
            Text(
                text = "navigate to forgot password"
            )
        }

        VerticalSpacer(16.dp)

        Button(
            onClick = {
                handleEvents(MainEvents.OnOpenSheet)
            }
        ) {
            Text(
                text = "open sheet"
            )
        }
    }

    ReactOnSingleChildChange(
        slot = component.slot
    )
}