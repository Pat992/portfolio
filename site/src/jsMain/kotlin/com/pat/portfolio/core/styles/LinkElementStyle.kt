package com.pat.portfolio.core.styles

import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backdropFilter
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val LinkElementStyle = CssStyle {
    base {
        Modifier
            .backgroundColor(Colors.Transparent)
            .backdropFilter()
            .border(width = 1.px, color = Colors.Transparent, style = LineStyle.Solid)
            .transition(Transition.of(TransitionProperty.All, duration = 200.ms))
    }
    hover {
        Modifier.glass()
    }
}