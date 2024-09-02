package com.pat.portfolio.components._widgets.navigation

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.ImageElement
import com.pat.portfolio.core.constants.Icons.PORTFOLIO_V2_ICON
import com.pat.portfolio.core.styles.NavItemStyle
import com.pat.portfolio.core.styles.link
import com.pat.portfolio.models.Section
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.*

@Composable
fun NavigationHomeItem() {
    val section = Section.Main
    val imageSize = 90.px
    Link(
        modifier = NavItemStyle
            .toModifier()
            .textAlign(TextAlign.Center)
            .link()
            .zIndex(60)
            .left(50.percent)
            .margin(left = -imageSize.div(2), top = 15.px)
            .position(Position.Fixed),
        path = "/${section.path}",
    ) {
        ImageElement(
            modifier = Modifier.size(imageSize),
            src = PORTFOLIO_V2_ICON,
            alt = "Home link"
        )
    }
}