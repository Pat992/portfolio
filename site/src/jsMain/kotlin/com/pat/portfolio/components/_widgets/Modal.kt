package com.pat.portfolio.components._widgets

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.styles.darkGlass
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.css.vw

@Composable
fun Modal(
    content: @Composable () -> Unit
) {
    Box(
        modifier = Modifier
            .darkGlass()
            .position(Position.Fixed)
            .top(0.px)
            .left(0.px)
            .zIndex(100)
            .width(100.vw)
            .height(100.vh),
        contentAlignment = Alignment.Center
    )
    {
        content()
    }
}