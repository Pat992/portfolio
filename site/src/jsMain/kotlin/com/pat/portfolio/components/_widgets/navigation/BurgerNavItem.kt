package com.pat.portfolio.components._widgets.navigation

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.observables.BurgerMenuObservable
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.Button
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

@Composable
fun BurgerNavItem() {
    Button(
        modifier = Modifier
            .margin(0.px)
            .padding(0.px)
            .backgroundColor(Colors.Transparent)
            .ariaLabel("Open navigation menu")
            .border(width = 0.px, color = Colors.Transparent, style = LineStyle.None),
        onClick = {
            BurgerMenuObservable.isOpen = !BurgerMenuObservable.isOpen
        }
    ) {
        Column(
            modifier = Modifier
                .height(20.px)
                .width(40.px),
            verticalArrangement = Arrangement.Center
        ) {
            BurgerNavItemLine()
            BurgerNavItemLine(isTop = false)
        }
    }
}

@Composable
private fun BurgerNavItemLine(
    isTop: Boolean = true
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .backgroundColor(Theme.MainTextColor.rgb)
            .height(1.px)
            .rotate(
                if (isTop && BurgerMenuObservable.isOpen) 45.deg
                else if (!isTop && BurgerMenuObservable.isOpen) (-45).deg
                else 0.deg
            )
            .margin(
                bottom = if (!BurgerMenuObservable.isOpen && isTop) 5.px else 0.px,
                top = if (!BurgerMenuObservable.isOpen && !isTop) 5.px else 0.px,
            )
            .transition(Transition.of(TransitionProperty.All.toString(), duration = 200.ms))
            .borderRadius(5.px)
    )
}