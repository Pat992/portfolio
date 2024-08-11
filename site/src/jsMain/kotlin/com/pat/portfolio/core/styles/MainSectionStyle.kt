package com.pat.portfolio.core.styles

import com.varabyte.kobweb.compose.css.AnimationIterationCount
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.animation
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.animation.Keyframes
import org.jetbrains.compose.web.css.AnimationTimingFunction
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s

val MainSectionTitleStyle = CssStyle {
    cssRule(" > #main-title-extension > ul") {
        Modifier
            .animation(
                MainSectionTitleKeyframes.toAnimation(
                    duration = 8.s,
                    iterationCount = AnimationIterationCount.Infinite,
                    timingFunction = AnimationTimingFunction.cubicBezier(0.23, 1.0, 0.32, 1.2),
                )
            )
    }
}

val MainSectionTitleKeyframes = Keyframes {
    0.percent { Modifier.margin(top = (-270).px) }
    5.percent { Modifier.margin(top = (-180).px) }
    33.percent { Modifier.margin(top = (-180).px) }
    38.percent { Modifier.margin(top = (-90).px) }
    66.percent { Modifier.margin(top = (-90).px) }
    71.percent { Modifier.margin(top = (-0).px) }
    99.99.percent { Modifier.margin(top = (-0).px) }
    100.percent { Modifier.margin(top = (-270).px) }
}