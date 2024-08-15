package com.pat.portfolio.components.eductationSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.cards.Card
import com.pat.portfolio.components._widgets.text.Paragraph
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.models.Education
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import org.jetbrains.compose.web.css.px

@Composable
fun EducationContent() {
    SimpleGrid(
        modifier = Modifier.fillMaxWidth(),
        numColumns = numColumns(base = 1, md = 2)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Education.entries.forEach { education ->
                EducationItem(
                    education = education,
                    index = education.ordinal
                )
            }
        }
        Card(
            modifier = Modifier.margin(left = 25.px),
            theme = Theme.HighlightColor3,
            content = {
                Paragraph(text = "some description will be here")
            }
        )
    }
}