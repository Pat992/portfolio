package com.pat.portfolio.components._widgets.cards

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.styles.glass
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier

@Composable
fun SecondaryCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier.glass(),
        contentAlignment = Alignment.Center
    ) {
        content()
    }
}