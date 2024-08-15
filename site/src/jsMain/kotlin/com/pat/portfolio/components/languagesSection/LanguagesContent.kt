package com.pat.portfolio.components.languagesSection

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import com.pat.portfolio.components._widgets.cards.GlassCard
import com.pat.portfolio.core.utils.ObserveViewportData
import com.pat.portfolio.core.utils.animateNumber
import com.pat.portfolio.models.Section
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun LanguagesContent() {
    val onViewportEntered = ObserveViewportData.sectionId == Section.Languages.id
    val animatedPercentage = remember { mutableStateListOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0) }

    LaunchedEffect(onViewportEntered) {
        if (onViewportEntered) {
            for (i in 0..<animatedPercentage.size) {
                println(i)
                animateNumber(
                    number = 50,
                    delay = 1L,
                    onUpdate = {
                        animatedPercentage[i] = it
                    }
                )
            }
        } else {
            for (i in 0..<animatedPercentage.size) {
                animatedPercentage[i] = 0
            }
        }
    }

    GlassCard(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 25.px)
    ) {
        SimpleGrid(
            modifier = Modifier.fillMaxWidth(),
            numColumns = numColumns(base = 1, md = 2)
        ) {
            LanguagesGithubCard()
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                LanguageCodeGraph(
                    language = "Test",
                    index = 0,
                    percentage = if (onViewportEntered) 50.percent else 0.percent,
                    animatedPercentage = if (onViewportEntered) animatedPercentage[0] else 0
                )
                LanguageCodeGraph(
                    language = "Test",
                    index = 1,
                    percentage = if (onViewportEntered) 50.percent else 0.percent,
                    animatedPercentage = if (onViewportEntered) animatedPercentage[1] else 0
                )
                LanguageCodeGraph(
                    language = "Test",
                    index = 2,
                    percentage = if (onViewportEntered) 50.percent else 0.percent,
                    animatedPercentage = if (onViewportEntered) animatedPercentage[2] else 0
                )
                LanguageCodeGraph(
                    language = "Test",
                    index = 3,
                    percentage = if (onViewportEntered) 50.percent else 0.percent,
                    animatedPercentage = if (onViewportEntered) animatedPercentage[3] else 0
                )
                LanguageCodeGraph(
                    language = "Test",
                    index = 4,
                    percentage = if (onViewportEntered) 50.percent else 0.percent,
                    animatedPercentage = if (onViewportEntered) animatedPercentage[4] else 0
                )
                LanguageCodeGraph(
                    language = "Test",
                    index = 5,
                    percentage = if (onViewportEntered) 50.percent else 0.percent,
                    animatedPercentage = if (onViewportEntered) animatedPercentage[5] else 0
                )
                LanguageCodeGraph(
                    language = "Test",
                    index = 6,
                    percentage = if (onViewportEntered) 50.percent else 0.percent,
                    animatedPercentage = if (onViewportEntered) animatedPercentage[6] else 0
                )
                LanguageCodeGraph(
                    language = "Test",
                    index = 7,
                    percentage = if (onViewportEntered) 50.percent else 0.percent,
                    animatedPercentage = if (onViewportEntered) animatedPercentage[7] else 0
                )
                LanguageCodeGraph(
                    language = "Test",
                    index = 8,
                    percentage = if (onViewportEntered) 50.percent else 0.percent,
                    animatedPercentage = if (onViewportEntered) animatedPercentage[8] else 0
                )
                LanguageCodeGraph(
                    language = "Test",
                    index = 9,
                    percentage = if (onViewportEntered) 50.percent else 0.percent,
                    animatedPercentage = if (onViewportEntered) animatedPercentage[9] else 0
                )
            }
        }
    }
}