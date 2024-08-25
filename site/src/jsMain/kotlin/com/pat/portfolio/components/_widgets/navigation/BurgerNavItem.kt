package com.pat.portfolio.components._widgets.navigation

import androidx.compose.runtime.Composable
import com.pat.portfolio.core.styles.Theme
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.Button
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

@Composable
fun BurgerNavItem() {
    Button(
        modifier = Modifier
            .margin(0.px)
            .padding(0.px)
            .backgroundColor(Colors.Transparent)
            .border(width = 0.px, color = Colors.Transparent, style = LineStyle.None),
        onClick = {}
    ) {
        Column(
            modifier = Modifier
                .height(20.px)
                .width(40.px),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .backgroundColor(Theme.MainTextColor.rgb)
                    .height(1.px)
                    .borderRadius(5.px)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .backgroundColor(Theme.MainTextColor.rgb)
                    .height(1.px)
                    .borderRadius(5.px)
            )
        }
    }
}