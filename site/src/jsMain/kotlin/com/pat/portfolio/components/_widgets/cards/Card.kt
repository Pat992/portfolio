package com.pat.portfolio.components._widgets.cards

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.styles.Theme
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

@Composable
fun Card(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .backgroundColor(Theme.PrimaryColor.rgb)
            .borderRadius(4.px)
            .border(width = 1.px, style = LineStyle.Solid, color = Theme.BorderColor.rgb),
        contentAlignment = Alignment.Center
    ) {
        content()
    }
}