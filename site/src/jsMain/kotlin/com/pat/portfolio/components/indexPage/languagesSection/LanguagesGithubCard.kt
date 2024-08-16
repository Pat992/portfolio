package com.pat.portfolio.components.indexPage.languagesSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.cards.Card
import com.pat.portfolio.components._widgets.svgs.GithubSvg
import com.pat.portfolio.components._widgets.text.Subtitle
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.models.Section
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun LanguagesGithubCard() {
    val breakpoint = rememberBreakpoint()
    Card(
        modifier = Modifier
            .padding(all = 25.px)
            .flex(1)
            .maxWidth(if (breakpoint >= Breakpoint.MD) 60.percent else 100.percent),
        theme = Theme.HighlightColor1,
        content = {
            Column(
                modifier = Modifier.fillMaxSize()
                    .textAlign(TextAlign.Center),
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                GithubSvg(
                    height = if (breakpoint >= Breakpoint.LG) 210.0 else 180.0,
                    width = if (breakpoint >= Breakpoint.LG) 210.0 else 180.0,
                )
                Subtitle(text = Section.Languages.subtitle)
            }
        }
    )
}