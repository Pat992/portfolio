package com.pat.portfolio.components._widgets

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.styles.Theme
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Hr

@Composable
fun HorizontalRule(
    modifier: Modifier = Modifier
) {
    Hr(
        attrs = Modifier
            .fillMaxWidth()
            .margin(topBottom = 25.px)
            .border(width = 1.px, color = Theme.HighlightColor4.rgb, style = LineStyle.Solid)
            .borderRadius(5.px)
            .then(modifier)
            .toAttrs()
    )
}