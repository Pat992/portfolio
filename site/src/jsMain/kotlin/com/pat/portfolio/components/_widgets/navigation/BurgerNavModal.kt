package com.pat.portfolio.components._widgets.navigation

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.observables.BurgerMenuObservable
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.theme.shapes.Circle
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.*

@Composable
fun BurgerNavModal(
    navigationItems: @Composable () -> Unit
) {
    Box(
        modifier = Modifier
            .display(DisplayStyle.Block)
            .position(Position.Fixed)
            .zIndex(40)
            .top(0.px)
            .left(0.px)
            .height(100.vh)
            .width(100.vw)
            .overflow(Overflow.Hidden)
            .clip(if (BurgerMenuObservable.isOpen) Circle(100, 50 to -10) else Circle(0, 50 to -10))
            .backgroundColor(Theme.HighlightColor4.rgb)
            .transition(Transition.of(TransitionProperty.All.toString(), duration = 500.ms))
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            navigationItems()
        }
    }
}