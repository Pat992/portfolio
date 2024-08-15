package com.pat.portfolio.components._widgets.inputs

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.styles.PrimaryButtonStyle
import com.pat.portfolio.core.styles.PrimaryButtonStyleGradient
import com.pat.portfolio.core.styles.primaryButton
import com.pat.portfolio.core.styles.primaryButtonGradient
import com.varabyte.kobweb.compose.css.PointerEvents
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.pointerEvents
import com.varabyte.kobweb.compose.ui.modifiers.zIndex
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toModifier


@Composable
fun LinkElement(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
    path: String,
) {
    Link(
        modifier = PrimaryButtonStyle
            .toModifier()
            .then(modifier)
            .primaryButton(),
        path = path,
    ) {
        Box(
            modifier =
            PrimaryButtonStyleGradient
                .toModifier()
                .then(modifier)
                .primaryButtonGradient()
                .zIndex(-1)
                .fillMaxSize()
        )
        Box(
            modifier = Modifier.pointerEvents(PointerEvents.None)
        ) {
            content()
        }
    }
}