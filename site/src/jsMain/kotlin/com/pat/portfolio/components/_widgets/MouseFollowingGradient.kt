package com.pat.portfolio.components._widgets

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.observables.ViewportDataObservable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.left
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.top
import com.varabyte.kobweb.compose.ui.styleModifier
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.minus
import org.jetbrains.compose.web.css.px

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
            .styleModifier {
                property(
                    "background",
                    "radial-gradient(800px, ${Theme.SecondaryBackgroundColor.hex}, transparent 80%)"
                )
            }
            .then(modifier)
    )
}