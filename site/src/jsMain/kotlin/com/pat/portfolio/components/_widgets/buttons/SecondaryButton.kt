package com.pat.portfolio.components._widgets.buttons

import androidx.compose.runtime.Composable
import androidx.compose.web.events.SyntheticMouseEvent
import com.pat.portfolio.core.styles.SecondaryButtonStyle
import com.pat.portfolio.core.styles.SecondaryButtonStyleGradient
import com.pat.portfolio.core.styles.primaryButtonGradient
import com.pat.portfolio.core.styles.secondaryButton
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.PointerEvents
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.dom.Button

@Composable
fun SecondaryButton(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
    onSubmit: (SyntheticMouseEvent) -> Unit
) {
    Button(
        attrs = SecondaryButtonStyle
            .toModifier()
            .secondaryButton()
            .cursor(Cursor.Pointer)
            .onClick { event -> onSubmit(event) }
            .then(modifier)
            .toAttrs(),
    ) {
        Box(
            modifier =
            SecondaryButtonStyleGradient
                .toModifier()
                .primaryButtonGradient()
                .zIndex(-1)
                .fillMaxSize()
                .then(modifier)
        )
        Box(
            modifier = Modifier.pointerEvents(PointerEvents.None),
            contentAlignment = Alignment.Center
        ) {
            content()
        }
    }
}