package com.pat.portfolio.components.projectPage

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.ImageElement
import com.pat.portfolio.components._widgets.buttons.PrimaryLinkElement
import com.pat.portfolio.components._widgets.cards.Card
import com.pat.portfolio.components._widgets.carousel.Carousel
import com.pat.portfolio.components._widgets.carousel.CarouselItem
import com.pat.portfolio.components._widgets.wrappers.ProjectsWrapper
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.models.SubProjects
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun ProjectItem(
    subProject: SubProjects,
    colorIndex: Int
) {
    ProjectsWrapper(
        project = subProject
    ) {
        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(all = 25.px),
            theme = Theme.entries[colorIndex],
            content = {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        ImageElement(
                            modifier = Modifier
                                .borderRadius(15.px)
                                .margin(bottom = 25.px)
                                .height(70.px),
                            src = subProject.icon,
                            alt = subProject.title
                        )
                        if (subProject.images.isNotEmpty())
                            Carousel(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .margin(bottom = 25.px),
                                id = "splide-${subProject.id}",
                                content = {
                                    subProject.images.forEach { image ->
                                        CarouselItem {
                                            ImageElement(
                                                modifier = Modifier
                                                    .borderRadius(15.px)
                                                    .width(100.percent),
                                                src = image,
                                                alt = ""
                                            )
                                        }
                                    }
                                }
                            )
                        Box()
                    }
                    SimpleGrid(
                        numColumns = numColumns(base = 1, md = 2)
                    ) {
                        Tools(subProject = subProject)
                        Overview(subProject = subProject)
                        PrimaryLinkElement(
                            path = subProject.externalUrl,
                            content = { SpanText("Visit") }
                        )
                    }
                }
            }
        )
    }
}