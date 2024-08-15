package com.pat.portfolio.components._widgets.buttons

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.styles.LinkElementStyle
import com.pat.portfolio.core.styles.NavItemStyle
import com.pat.portfolio.core.styles.link
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.px

@Composable
fun LinkElement(
    modifier: Modifier = Modifier,
    path: String,
    content: @Composable () -> Unit
) {
    Box(
        modifier = LinkElementStyle
            .toModifier()
            .padding(all = 15.px)
            .borderRadius(20.px)
            .then(modifier)
    ) {
        Link(
            modifier = NavItemStyle
                .toModifier()
                .textAlign(TextAlign.Center)
                .link(),
            path = path,
        ) {
            content()
        }
    }
}