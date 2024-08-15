package com.pat.portfolio.components._widgets.cards

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.core.styles.glass
import com.varabyte.kobweb.compose.css.CSSPosition
import com.varabyte.kobweb.compose.css.functions.radialGradient
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundImage

@Composable
fun Card(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
    theme: Theme = Theme.HighlightColor2
) {
    Box(
        modifier = modifier
            .glass()
            .backgroundImage(
                gradient = radialGradient(
                    from = theme.rgba!!,
                    to = Colors.Transparent,
                    position = CSSPosition.BottomRight
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        content()
    }
}