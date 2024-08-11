package com.pat.portfolio.core.styles

import com.pat.portfolio.core.constants.Font.FONT_FAMILY
import com.varabyte.kobweb.compose.css.Height
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.Width
import com.varabyte.kobweb.compose.css.functions.blur
import com.varabyte.kobweb.compose.css.functions.saturate
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

fun Modifier.titleText(): Modifier {
    return this
        .fontFamily(FONT_FAMILY)
        .color(Theme.MainTextColor.rgb)
}

fun Modifier.link(): Modifier {
    return this
        .titleText()
        .textDecorationLine(TextDecorationLine.None)
}

fun Modifier.paragraphText(): Modifier {
    return this
        .fontFamily(FONT_FAMILY)
        .color(Theme.SecondaryTextColor.rgb)
}

fun Modifier.glass(): Modifier {
    return this
        .backdropFilter(blur(5.px), saturate(180.percent))
        .backgroundColor(Theme.GlassBackgroundColor.rgb)
        .border(width = 1.px, color = Theme.GlassBorderColor.rgb, style = LineStyle.Solid)
        .borderRadius(4.px)
}

fun Modifier.primaryButton(): Modifier {
    return this
        .glass()
        .link()
        .padding(all = 20.px)
        .height(Height.MaxContent)
        .width(Width.MaxContent)
        .textAlign(TextAlign.Center)
}