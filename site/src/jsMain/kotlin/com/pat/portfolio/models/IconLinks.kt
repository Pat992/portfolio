package com.pat.portfolio.models

import com.pat.portfolio.core.constants.Icons.GITHUB_ICON
import com.pat.portfolio.core.constants.Icons.KOBWEB_ICON
import com.pat.portfolio.core.constants.Icons.KOTLIN_ICON
import com.pat.portfolio.core.constants.Icons.LINKEDIN_ICON

enum class IconLinks(
    val itemName: String,
    val iconPath: String,
    val url: String,
) {
    Kotlin(
        itemName = "Kotlin",
        iconPath = KOTLIN_ICON,
        url = "https://kotlinlang.org/"
    ),
    Kobweb(
        itemName = "Kobweb",
        iconPath = KOBWEB_ICON,
        url = "https://kobweb.varabyte.com/"
    ),
    Linkedin(
        itemName = "LinkedIn",
        iconPath = LINKEDIN_ICON,
        url = "https://www.linkedin.com/in/patrick-hettich/"
    ),
    Github(
        itemName = "Github",
        iconPath = GITHUB_ICON,
        url = "https://github.com/Pat992/"
    )
}