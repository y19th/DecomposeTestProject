package com.y19th.decomposetestproject.splash.ui

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import com.y19th.decomposetestproject.splash.logic.SplashEvents
import com.y19th.dextension.compose.rememberHandleEvents

@Composable
internal fun SplashContent(
    component: SplashComponent,
) {
    val handleEvents = component.rememberHandleEvents()
    val currentAlpha = remember { Animatable(0f) }

    LaunchedEffect(Unit) {
        currentAlpha.animateTo(
            targetValue = 1f,
            animationSpec = tween(700)
        )
        handleEvents(SplashEvents.OnAnimationEnd)
    }

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            modifier = Modifier
                .alpha(currentAlpha.value),
            text = "decompose test app"
        )
    }
}