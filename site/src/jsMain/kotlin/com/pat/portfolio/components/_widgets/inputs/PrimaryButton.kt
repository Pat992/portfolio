package com.pat.portfolio.components._widgets.inputs

import androidx.compose.runtime.Composable
import androidx.compose.web.events.SyntheticMouseEvent
import com.pat.portfolio.core.styles.PrimaryButtonStyle
import com.pat.portfolio.core.styles.PrimaryButtonStyleGradient
import com.pat.portfolio.core.styles.primaryButton
import com.pat.portfolio.core.styles.primaryButtonGradient
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.PointerEvents
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.dom.Button

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
    onSubmit: (SyntheticMouseEvent) -> Unit
) {
    Button(
        attrs = PrimaryButtonStyle
            .toModifier()
            .then(modifier)
            .primaryButton()
            .cursor(Cursor.Pointer)
            .onClick { event -> onSubmit(event) }
            .toAttrs(),
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