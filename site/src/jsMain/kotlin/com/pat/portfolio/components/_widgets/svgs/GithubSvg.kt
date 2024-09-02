package com.pat.portfolio.components._widgets.svgs

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.constants.SvgPaths.GITHUB_PATH
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.margin
import org.jetbrains.compose.web.css.px

@Composable
fun GithubSvg(
    height: Double,
    width: Double,
    color: String,
) {
    SvgElement(
        modifier = Modifier.margin(bottom = 50.px),
        path = GITHUB_PATH,
        height = height,
        width = width,
        color = color,
        viewBoxValue = "0 0 256 250"
    )
}