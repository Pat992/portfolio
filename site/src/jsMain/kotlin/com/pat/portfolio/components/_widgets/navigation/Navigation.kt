package com.pat.portfolio.components._widgets.navigation

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.ImageElement
import com.pat.portfolio.core.constants.Icons.PORTFOLIO_V2_ICON
import com.pat.portfolio.core.styles.NavItemStyle
import com.pat.portfolio.core.styles.glass
import com.pat.portfolio.core.styles.linearGradient
import com.pat.portfolio.core.styles.link
import com.pat.portfolio.models.Section
import com.pat.portfolio.observables.ViewportDataObservable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Nav

@Composable
fun Navigation(
    showBurgerMenu: Boolean = true,
    navigationItems: @Composable () -> Unit
) {
    val breakpoint = rememberBreakpoint()
    if (breakpoint >= Breakpoint.XL)
        NavigationHomeItem()
    Nav(
        attrs = Modifier
            .maxWidth(1920.px)
            .glass()
            .height(70.px)
            .zIndex(50)
            .borderRadius(50.px)
            .padding(leftRight = 10.px)
            .margin(top = 25.px)
            .fillMaxWidth(90.percent)
            .position(Position.Fixed)
            .toAttrs(),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(leftRight = 20.px),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .backgroundColor(Colors.Red)
                    .width((ViewportDataObservable.scrollPercentage * 100).percent)
                    .linearGradient()
            )
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .margin(top = (-4).px)
                .padding(topBottom = 10.px),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (breakpoint >= Breakpoint.XL)
                navigationItems()
            if (breakpoint < Breakpoint.XL) {
                Link(
                    modifier = NavItemStyle
                        .toModifier()
                        .size(40.px)
                        .textAlign(TextAlign.Center)
                        .link()
                        .title("${Section.Main.title} section link")
                        .attrsModifier {
                            attr("alt", "${Section.Main.title} section link")
                        },
                    path = "/${Section.Main.path}",
                ) {
                    ImageElement(
                        modifier = Modifier.height(40.px),
                        src = PORTFOLIO_V2_ICON,
                        alt = "Home link"
                    )
                }
                if (showBurgerMenu)
                    BurgerNavItem()
            }
        }
    }
}