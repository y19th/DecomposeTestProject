package com.y19th.decomposetestproject.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@NonRestartableComposable
@Composable
fun VerticalSpacer(height: Dp) {
    Spacer(Modifier.height(height))
}