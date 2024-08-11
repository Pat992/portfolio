package com.pat.portfolio.components.workSection

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.cards.Card
import com.pat.portfolio.components._widgets.text.Paragraph
import com.pat.portfolio.models.WorkExperience
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import org.jetbrains.compose.web.css.px

@Composable
fun WorkContent() {
    SimpleGrid(
        modifier = Modifier.fillMaxWidth(),
        numColumns = numColumns(base = 1, md = 2)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            WorkExperience.entries.forEach { we ->
                WorkItem(workExperience = we)
            }
        }
        Card(
            modifier = Modifier.margin(left = 25.px)
        ) {
            Paragraph(text = "some description will be here")
        }
    }
}