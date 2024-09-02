package com.pat.portfolio.components._widgets.cards

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.core.styles.glass
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.styleModifier

@Composable
fun Card(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
    theme: Theme = Theme.HighlightColor2
) {
    Box(
        modifier = Modifier
            .glass()
            .styleModifier {
                property(
                    "background",
                    "radial-gradient(circle at 90% 90%, " +
                            "${theme.rgba} 0%, " +
                            "${Colors.Transparent} 60%) "
                )
            }
            .then(modifier),
        contentAlignment = Alignment.Center
    ) {
        content()
    }
}