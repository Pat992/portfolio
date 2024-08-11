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
        hex = "#C8CBCC",
        rgb = rgb(r = 200, g = 203, b = 204)
    ),
    BackgroundColor(
        hex = "#07001c",
        rgb = rgb(r = 7, g = 0, b = 28)
    ),
    PrimaryColor(
        hex = "#10003d",
        rgb = rgb(r = 16, g = 0, b = 61)
    ),
    SecondaryColor(
        hex = "#150050",
        rgb = rgb(r = 21, g = 0, b = 80)
    ),
    BorderColor(
        hex = "#3F0071",
        rgb = rgb(r = 63, g = 0, b = 113)
    ),
    GlassBackgroundColor(
        hex = "#FFFFFF",
        rgb = rgba(r = 255, g = 255, b = 255, a = 0.05)
    ),
    GlassBorderColor(
        hex = "#FFFFFF",
        rgb = rgba(r = 255, g = 255, b = 255, a = 0.125)
    ),
    HighlightColor1(
        hex = "#080DCB",
        rgb = rgb(r = 13, g = 203, b = 100)
    ),
    HighlightColor2(
        hex = "#9D89DE",
        rgb = rgb(r = 157, g = 137, b = 222)
    ),
    HighlightColor3(
        hex = "#F0D42F",
        rgb = rgb(r = 240, g = 212, b = 47)
    ),
    HighlightColor4(
        hex = "#E95640",
        rgb = rgb(r = 233, g = 86, b = 64)
    ),
}