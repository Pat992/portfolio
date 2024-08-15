package com.pat.portfolio.models

import com.pat.portfolio.core.constants.Icons.KOBWEB_ICON
import com.pat.portfolio.core.constants.Icons.KOTLIN_ICON

enum class Tech(
    val techName: String,
    val iconPath: String,
    val url: String,
) {
    Kotlin(
        techName = "Kotlin",
        iconPath = KOTLIN_ICON,
        url = "https://kotlinlang.org/"
    ),
    Kobweb(
        techName = "Kobweb",
        iconPath = KOBWEB_ICON,
        url = "https://kobweb.varabyte.com/"
    )
}