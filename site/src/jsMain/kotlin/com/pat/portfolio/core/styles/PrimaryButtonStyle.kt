package com.pat.portfolio.core.styles

import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.ms

val PrimaryButtonStyle = CssStyle {
    base {
        Modifier
            .color(Theme.MainTextColor.rgb)
            .transition(Transition.of("color", duration = 200.ms))
    }
    hover {
        Modifier.color(Theme.BackgroundColor.rgb)
    }
}

val PrimaryButtonStyleGradient = CssStyle {
    base {
        Modifier
            .opacity(0)
            .transition(Transition.of("opacity", duration = 200.ms))
    }
    hover {
        Modifier.opacity(1)
    }
}