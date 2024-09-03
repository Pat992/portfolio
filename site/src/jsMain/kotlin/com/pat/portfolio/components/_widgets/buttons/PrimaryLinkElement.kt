package com.pat.portfolio.components._widgets.buttons

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.styles.PrimaryButtonStyleGradient
import com.pat.portfolio.core.styles.primaryButton
import com.pat.portfolio.core.styles.primaryButtonGradient
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.classNames
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.title
import com.varabyte.kobweb.compose.ui.modifiers.zIndex
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.dom.Span


@Composable
fun PrimaryLinkElement(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
    path: String,
    title: String
) {
    Link(
        modifier = PrimaryButtonStyleGradient
            .toModifier()
            .primaryButton()
            .title(title)
            .attrsModifier {
                attr("alt", title)
            }
            .then(modifier),
        path = path,
    ) {
        Span(
            attrs = Modifier
                .classNames("button-gradient")
                .then(modifier)
                .primaryButtonGradient()
                .zIndex(-1)
                .fillMaxSize()
                .toAttrs()
        )
        content()
    }
}