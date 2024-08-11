package com.pat.portfolio.components.languagesSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.cards.SecondaryCard
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
    SecondaryCard(
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
                LanguageCodeGraph(language = "Test", index = 0, percentage = 50.percent, animatedPercentage = 50)
                LanguageCodeGraph(language = "Test", index = 1, percentage = 50.percent, animatedPercentage = 50)
                LanguageCodeGraph(language = "Test", index = 2, percentage = 50.percent, animatedPercentage = 50)
                LanguageCodeGraph(language = "Test", index = 3, percentage = 50.percent, animatedPercentage = 50)
                LanguageCodeGraph(language = "Test", index = 4, percentage = 50.percent, animatedPercentage = 50)
                LanguageCodeGraph(language = "Test", index = 5, percentage = 50.percent, animatedPercentage = 50)
                LanguageCodeGraph(language = "Test", index = 6, percentage = 50.percent, animatedPercentage = 50)
                LanguageCodeGraph(language = "Test", index = 7, percentage = 50.percent, animatedPercentage = 50)
                LanguageCodeGraph(language = "Test", index = 8, percentage = 50.percent, animatedPercentage = 50)
                LanguageCodeGraph(language = "Test", index = 9, percentage = 50.percent, animatedPercentage = 50)
            }
        }
    }
}