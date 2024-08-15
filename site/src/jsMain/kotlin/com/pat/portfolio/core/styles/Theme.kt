package com.pat.portfolio.core.styles

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgb
import org.jetbrains.compose.web.css.rgba

enum class Theme(
    val hex: String,
    val rgb: CSSColorValue,
    val rgba: CSSColorValue?
) {
    MainTextColor(
        hex = "#FFFFFF",
        rgb = rgb(r = 255, g = 255, b = 255),
        rgba = null
    ),
    SecondaryTextColor(
        hex = "#EDEDED",
        rgb = rgb(r = 237, g = 237, b = 237),
        rgba = null
    ),
    BackgroundColor(
        hex = "#100F1D",
        rgb = rgb(r = 16, g = 15, b = 29),
        rgba = rgba(r = 16, g = 15, b = 29, a = 0.5)
    ),
    SecondaryBackgroundColor(
        hex = "#2F2D46",
        rgb = rgb(r = 47, g = 45, b = 70),
        rgba = null
    ),
    GlassBackgroundColor(
        hex = "#FFFFFF",
        rgb = rgba(r = 255, g = 255, b = 255, a = 0.05),
        rgba = rgba(r = 255, g = 255, b = 255, a = 0.05)
    ),
    GlassBorderColor(
        hex = "#FFFFFF",
        rgb = rgba(r = 255, g = 255, b = 255, a = 0.1),
        rgba = rgba(r = 255, g = 255, b = 255, a = 0.1)
    ),
    HighlightColor1(
        hex = "#F1ED97",
        rgb = rgb(r = 241, g = 237, b = 151),
        rgba = rgba(r = 241, g = 237, b = 151, a = 0.25)
    ),
    HighlightColor2(
        hex = "#EF9571",
        rgb = rgb(r = 239, g = 149, b = 113),
        rgba = rgba(r = 239, g = 149, b = 113, a = 0.25)
    ),
    HighlightColor3(
        hex = "#E46D97",
        rgb = rgb(r = 228, g = 109, b = 151),
        rgba = rgba(r = 228, g = 109, b = 151, a = 0.25)
    ),
    HighlightColor4(
        hex = "#95A8EA",
        rgb = rgb(r = 149, g = 168, b = 234),
        rgba = rgba(r = 149, g = 168, b = 234, a = 0.25)
    ),
}