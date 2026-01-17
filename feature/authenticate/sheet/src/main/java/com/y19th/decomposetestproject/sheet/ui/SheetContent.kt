package com.y19th.decomposetestproject.sheet.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.y19th.decomposetestproject.sheet.logic.SheetEvents
import com.y19th.decomposetestproject.ui.components.VerticalSpacer
import com.y19th.dextension.compose.collectAsImmediateState
import com.y19th.dextension.compose.rememberHandleEvents

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun SheetContent(
    component: SheetComponent,
) {
    val state = component.state.collectAsImmediateState()
    val handleEvents = component.rememberHandleEvents()

    ModalBottomSheet(
        onDismissRequest = { handleEvents(SheetEvents.OnNavigateBack) }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 12.dp)
        ) {
            VerticalSpacer(24.dp)

            OutlinedTextField(
                value = state.value.mail,
                onValueChange = { handleEvents(SheetEvents.OnMailChanged(it)) }
            )

            VerticalSpacer(16.dp)

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { handleEvents(SheetEvents.OnConfirmValue) }
            ) {
                Text(
                    text = "confirm"
                )
            }
        }
    }

}