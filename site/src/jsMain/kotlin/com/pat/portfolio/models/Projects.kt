package com.pat.portfolio.models

import com.pat.portfolio.core.constants.SvgPaths

enum class Projects(
    val title: String,
    val shortDescription: String,
    val description: String,
    val svgPath: String
) {
    Api(
        title = "API & Data integration",
        shortDescription = "Developed multiple APIs with Next.js and published them on RapidAPI.",
        description = "",
        svgPath = SvgPaths.API_PATH
    ),
    Mobile(
        title = "Mobile",
        shortDescription = "Developed multiple mobile Apps with Flutter and published them on the Google PlayStore",
        description = "",
        svgPath = SvgPaths.PLAY_STORE_PATH
    ),
    Web(
        title = "Web",
        shortDescription = "Developed landing pages.",
        description = "",
        svgPath = SvgPaths.WEBSITE_PATH
    )
}