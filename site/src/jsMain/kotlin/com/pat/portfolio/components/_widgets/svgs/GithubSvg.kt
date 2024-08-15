package com.pat.portfolio.components._widgets.svgs

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.constants.SvgPaths.GITHUB_PATH
import com.pat.portfolio.core.styles.Theme

@Composable
fun GithubSvg(
    height: Double,
    width: Double
) {
    SvgElement(
        path = GITHUB_PATH,
        height = height,
        width = width,
        color = Theme.SecondaryTextColor.hex,
        viewBoxValue = "0 0 256 250"
    )
}