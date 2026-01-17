package com.y19th.decomposetestproject.base.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.stack.Children
import com.arkivanov.decompose.extensions.compose.stack.animation.StackAnimator
import com.arkivanov.decompose.extensions.compose.stack.animation.slide
import com.arkivanov.decompose.extensions.compose.stack.animation.stackAnimation
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import com.y19th.dextension.compose.ProvideContent

@Composable
fun <C : Any, T : ScreenHolder> ScreenHolderChildren(
    stack: Value<ChildStack<C, T>>,
    modifier: Modifier = Modifier,
    animator: StackAnimator = slide(),
) {
    Children(
        modifier = modifier,
        stack = stack,
        animation = stackAnimation(animator),
        content = { ProvideContent(it.instance.screen) }
    )
}