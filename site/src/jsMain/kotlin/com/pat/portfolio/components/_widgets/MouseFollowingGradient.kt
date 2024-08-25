package com.pat.portfolio.components._widgets

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.observables.ViewportDataObservable
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import org.jetbrains.compose.web.css.*

@Composable
fun MouseFollowingGradient(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .size(1250.px)
            .position(Position.Fixed)
            .top((ViewportDataObservable.mousePositionY).px.minus(600.px))
            .left((ViewportDataObservable.mousePositionX).px.minus(600.px))
            .transition(
                Transition.of(
                    TransitionProperty.All.toString(),
                    duration = 500.ms,
                    AnimationTimingFunction.EaseOut
                )
            )
            .styleModifier {
                property(
                    "background",
                    "radial-gradient(800px, ${Theme.SecondaryBackgroundColor.rgba}, transparent 80%)"
                )
            }
            .then(modifier)
    )
}