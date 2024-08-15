package com.pat.portfolio.core.styles

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgb
import org.jetbrains.compose.web.css.rgba

enum class Theme(
    val hex: String,
    val rgb: CSSColorValue
) {
    MainTextColor(
        hex = "#FFFFFF",
        rgb = rgb(r = 255, g = 255, b = 255)
    ),
    SecondaryTextColor(
        hex = "#EDEDED",
        rgb = rgb(r = 237, g = 237, b = 237)
    ),
    BackgroundColor(
        hex = "#1D1B36",
        rgb = rgb(r = 29, g = 27, b = 54)
    ),
    SecondaryBackgroundColor(
        hex = "#2F2D46",
        rgb = rgb(r = 47, g = 45, b = 70)
    ),
    BorderColor(
        hex = "#EDEDED",
        rgb = rgba(r = 237, g = 237, b = 237, a = 0.5)
    ),
    GlassBackgroundColor(
        hex = "#FFFFFF",
        rgb = rgba(r = 255, g = 255, b = 255, a = 0.05)
    ),
    GlassBorderColor(
        hex = "#FFFFFF",
        rgb = rgba(r = 255, g = 255, b = 255, a = 0.1)
    ),
    HighlightColor1(
        hex = "#F1ED97",
        rgb = rgb(r = 241, g = 237, b = 151)
    ),
    HighlightColor2(
        hex = "#EF9571",
        rgb = rgb(r = 239, g = 149, b = 113)
    ),
    HighlightColor3(
        hex = "#E46D97",
        rgb = rgb(r = 149, g = 168, b = 234)
    ),
    HighlightColor4(
        hex = "#95A8EA",
        rgb = rgb(r = 233, g = 86, b = 64)
    ),
}