package com.pat.portfolio.components._widgets.inputs

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.styles.primaryButton
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.silk.components.navigation.Link


@Composable
fun LinkElement(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
    path: String
) {
    Link(
        modifier = modifier.primaryButton(),
        path = path,
    ) {
        content()
    }
}