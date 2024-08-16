package com.pat.portfolio.models

import com.pat.portfolio.core.constants.ExternalUrls.GITHUB_CONTACT_URL
import com.pat.portfolio.core.constants.ExternalUrls.KOBWEB_URL
import com.pat.portfolio.core.constants.ExternalUrls.KOTLIN_URL
import com.pat.portfolio.core.constants.ExternalUrls.LINKEDIN_CONTACT_URL
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
        url = KOTLIN_URL
    ),
    Kobweb(
        itemName = "Kobweb",
        iconPath = KOBWEB_ICON,
        url = KOBWEB_URL
    ),
    Linkedin(
        itemName = "LinkedIn",
        iconPath = LINKEDIN_ICON,
        url = LINKEDIN_CONTACT_URL
    ),
    Github(
        itemName = "Github",
        iconPath = GITHUB_ICON,
        url = GITHUB_CONTACT_URL
    )
}