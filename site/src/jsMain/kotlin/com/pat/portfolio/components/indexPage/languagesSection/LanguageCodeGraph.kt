package com.pat.portfolio.components.indexPage.languagesSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.text.Paragraph
import com.pat.portfolio.core.styles.Theme
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import org.jetbrains.compose.web.css.*

@Composable
fun LanguageCodeGraph(
    language: String,
    percentage: CSSSizeValue<CSSUnit.percent> = 50.percent,
    animatedPercentage: Int,
    index: Int
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .margin(bottom = 5.px, top = 25.px),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Paragraph(language)
            Paragraph("$animatedPercentage%")
        }
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            LanguageBarProgress(
                percentage = 100.percent,
                index = index,
                color = Theme.BackgroundColor.rgb
            )
            LanguageBarProgress(
                percentage = percentage,
                index = index,
                color = Theme.HighlightColor1.rgb
            )
        }
    }
}

@Composable
private fun LanguageBarProgress(
    percentage: CSSSizeValue<CSSUnit.percent>,
    index: Int,
    color: CSSColorValue,
) {
    Box(
        modifier = Modifier
            .height(10.px)
            .borderRadius(10.px)
            .fillMaxWidth(percentage)
            .backgroundColor(color)
            .transition(
                Transition.of(
                    property = "width",
                    duration = 1000.ms,
                    delay = 100.ms * index
                )
            )
    )
}