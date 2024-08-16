package com.pat.portfolio.components.projectPage

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.ImageElement
import com.pat.portfolio.components._widgets.cards.Card
import com.pat.portfolio.components._widgets.carousel.Carousel
import com.pat.portfolio.components._widgets.carousel.CarouselItem
import com.pat.portfolio.components._widgets.text.Paragraph
import com.pat.portfolio.components._widgets.text.Subtitle
import com.pat.portfolio.components._widgets.wrappers.ProjectsWrapper
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.models.SubProjects
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
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
                                        //.objectFit(ObjectFit.Cover)
                                        // .height(300.px),
                                        src = image,
                                        alt = ""
                                    )
                                }
                            }
                        }
                    )
                    SimpleGrid(
                        numColumns = numColumns(base = 1, md = 2)
                    ) {
                        ImageElement(
                            modifier = Modifier
                                .borderRadius(15.px)
                                .size(70.px),
                            src = subProject.icon,
                            alt = subProject.title
                        )
                        Column {
                            Subtitle(
                                modifier = Modifier.margin(bottom = 25.px),
                                text = "Overview"
                            )
                            subProject.description.split("|").forEach { part ->
                                Paragraph(
                                    modifier = Modifier.margin(bottom = 15.px),
                                    text = part
                                )
                            }
                        }
                    }
                }
            }
        )
    }
}