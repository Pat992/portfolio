package com.pat.portfolio.components.indexPage.languagesSection

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import com.pat.portfolio.components._widgets.cards.GlassCard
import com.pat.portfolio.core.utils.animateNumber
import com.pat.portfolio.models.Section
import com.pat.portfolio.observables.GithubObservable
import com.pat.portfolio.observables.ViewportDataObservable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import kotlin.math.roundToInt

@Composable
fun LanguagesContent() {
    val onViewportEntered = ViewportDataObservable.sectionId == Section.Languages.id
    val githubObservable = GithubObservable
    val animatedPercentage = remember { mutableStateListOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0) }

    LaunchedEffect(key1 = onViewportEntered, key2 = githubObservable.requestStatus) {
        if (onViewportEntered) {
            for (i in 0..<githubObservable.languages.size) {
                val language = githubObservable.languages[i]
                val totalCount = githubObservable.languagesCount
                val percentage = ((language.count * 100) / totalCount.toDouble()).roundToInt()
                animateNumber(
                    number = percentage,
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
                for (i in 0..<githubObservable.languages.size) {
                    val language = githubObservable.languages[i]
                    val totalCount = githubObservable.languagesCount
                    val percentage = ((language.count * 100) / totalCount.toDouble()).roundToInt()
                    LanguageCodeGraph(
                        language = language.language,
                        index = i,
                        percentage = if (onViewportEntered) percentage.percent else 0.percent,
                        animatedPercentage = if (onViewportEntered) animatedPercentage[i] else 0
                    )
                }
            }
        }
    }
}