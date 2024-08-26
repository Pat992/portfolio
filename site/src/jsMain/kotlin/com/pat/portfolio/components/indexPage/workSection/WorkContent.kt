package com.pat.portfolio.components.indexPage.workSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.ToolsTechCard
import com.pat.portfolio.models.WorkExperience
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.px

@Composable
fun WorkContent() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        val breakpoint = rememberBreakpoint()

        WorkExperience.entries.forEach { we ->
            SimpleGrid(
                modifier = Modifier.fillMaxWidth(),
                numColumns = numColumns(base = 1, lg = 2)
            ) {
                ToolsTechCard(
                    technologies = we.technologies,
                    tools = we.tools
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .margin(left = if (breakpoint > Breakpoint.MD) 50.px else 0.px)
                ) {
                    we.positions.forEach { pos ->
                        JobPositionItem(
                            showCompany = pos.showCompany,
                            workExperience = we,
                            position = pos,
                            index = pos.ordinal
                        )
                    }
                }
            }
        }
    }
}