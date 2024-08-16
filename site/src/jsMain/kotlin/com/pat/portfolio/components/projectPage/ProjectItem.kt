package com.pat.portfolio.components.projectPage

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.ImageElement
import com.pat.portfolio.components._widgets.cards.Card
import com.pat.portfolio.components._widgets.carousel.Carousel
import com.pat.portfolio.components._widgets.carousel.CarouselItem
import com.pat.portfolio.components._widgets.wrappers.ProjectsWrapper
import com.pat.portfolio.core.styles.Theme
import com.pat.portfolio.models.SubProjects
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
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
                Carousel(
                    modifier = Modifier.fillMaxWidth(),
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
            }
        )
    }
}