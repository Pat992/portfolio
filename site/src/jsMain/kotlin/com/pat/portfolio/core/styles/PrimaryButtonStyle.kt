package com.pat.portfolio.core.styles

import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.style.CssStyle
import org.jetbrains.compose.web.css.ms

val PrimaryButtonStyleGradient = CssStyle {
    cssRule(" > .button-gradient") {
        Modifier
            .opacity(0)
            .transition(Transition.of("opacity", duration = 200.ms))
    }
    cssRule(":hover > .button-gradient") {
        Modifier.opacity(1)
    }
//    base {
//        Modifier
//            .opacity(0)
//            .transition(Transition.of("opacity", duration = 200.ms))
//    }
//    hover {
//        Modifier.opacity(1)
//    }
}