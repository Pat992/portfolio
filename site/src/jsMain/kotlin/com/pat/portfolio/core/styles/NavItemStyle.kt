package com.pat.portfolio.core.styles

import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.ms

val NavItemStyle = CssStyle {
    base {
        Modifier
            .color(Theme.SecondaryTextColor.rgb)
            .transition(Transition.Companion.of("color", 200.ms))
    }
    hover {
        Modifier.color(Theme.MainTextColor.rgb)
    }
}