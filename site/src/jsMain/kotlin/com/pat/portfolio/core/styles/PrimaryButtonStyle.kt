package com.pat.portfolio.core.styles

import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundImage
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val PrimaryButtonStyle = CssStyle {
    base {
        Modifier
            .primaryButton()
            .backgroundImage(linearGradient(LinearGradient.Direction.ToRight, Colors.Transparent, Colors.Transparent))
            .transition(Transition.of(TransitionProperty.All.toString(), duration = 200.ms))
    }
    hover {
        Modifier
            .color(Theme.BackgroundColor.rgb)
            .border(width = 1.px, color = Colors.Transparent, style = LineStyle.Solid)
            .backgroundImage(
                linearGradient(
                    LinearGradient.Direction.ToRight,
                    Theme.HighlightColor3.rgb,
                    Theme.HighlightColor4.rgb
                )
            )
    }
}