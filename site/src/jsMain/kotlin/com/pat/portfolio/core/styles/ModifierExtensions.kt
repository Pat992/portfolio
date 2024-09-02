package com.pat.portfolio.core.styles

import com.pat.portfolio.core.constants.FontSizes.FONT_FAMILY
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.functions.blur
import com.varabyte.kobweb.compose.css.functions.saturate
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

fun Modifier.textFontFamily(): Modifier {
    return this.fontFamily(FONT_FAMILY)
}

fun Modifier.titleText(): Modifier {
    return this
        .textFontFamily()
        .color(Theme.MainTextColor.rgb)
}

fun Modifier.link(): Modifier {
    return this
        .textFontFamily()
        .fontWeight(FontWeight.Medium)
        .textDecorationLine(TextDecorationLine.None)
}

fun Modifier.paragraphText(): Modifier {
    return this
        .textFontFamily()
        .color(Theme.SecondaryTextColor.rgb)
}

fun Modifier.glass(): Modifier {
    return this
        .backdropFilter(blur(5.px), saturate(180.percent))
        .backgroundColor(Theme.GlassBackgroundColor.rgb)
        .border(width = 1.px, color = Theme.GlassBorderColor.rgb, style = LineStyle.Solid)
        .borderRadius(15.px)
}

fun Modifier.darkGlass(): Modifier {
    return this
        .backdropFilter(blur(10.px), saturate(180.percent))
        .backgroundColor(Theme.BackgroundColor.rgba!!)
}

fun Modifier.primaryButton(): Modifier {
    return this
        .glass()
        .backgroundColor(Theme.HighlightColor1.rgb)
        .color(Theme.BackgroundColor.rgb)
        .link()
        .padding(all = 20.px)
        .height(Height.MaxContent)
        .width(Width.MaxContent)
        .textAlign(TextAlign.Center)
        .borderRadius(50.px)
}

fun Modifier.secondaryButton(): Modifier {
    return this
        .glass()
        .link()
        .padding(all = 20.px)
        .height(Height.MaxContent)
        .width(Width.MaxContent)
        .textAlign(TextAlign.Center)
        .borderRadius(50.px)
}

fun Modifier.primaryButtonGradient(): Modifier {
    return this
        .linearGradientSmall()
        .fillMaxSize()
        .position(Position.Absolute)
        .borderRadius(15.px)
        .top(0.px)
        .left(0.px)
        .borderRadius(50.px)
}

fun Modifier.linearGradient(): Modifier {
    return this
        .height(4.px)
        .borderRadius(2.px)
        .styleModifier {
            property(
                "background",
                "linear-gradient(90deg, " +
                        "${Theme.HighlightColor1.hex} 0%, " +
                        "${Theme.HighlightColor2.hex} 25%, " +
                        "${Theme.HighlightColor3.hex} 50%, " +
                        "${Theme.HighlightColor4.hex} 100%)"
            )
        }
}

fun Modifier.linearGradientSmall(): Modifier {
    return this
        .height(4.px)
        .borderRadius(2.px)
        .styleModifier {
            property(
                "background",
                "linear-gradient(90deg, " +
                        "${Theme.HighlightColor1.hex} 0%, " +
                        "${Theme.HighlightColor2.hex} 100%) "
            )
        }
}