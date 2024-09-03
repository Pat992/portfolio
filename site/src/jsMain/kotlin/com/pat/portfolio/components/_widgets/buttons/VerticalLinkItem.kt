package com.pat.portfolio.components._widgets.buttons

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.ImageElement
import com.pat.portfolio.components._widgets.text.Paragraph
import com.pat.portfolio.models.IconLinks
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.px

@Composable
fun VerticalLinkItem(iconLink: IconLinks) {
    val breakpoint = rememberBreakpoint()
    LinkElement(
        title = iconLink.itemName,
        path = iconLink.url,
        modifier = Modifier
            .padding(10.px)
            .minHeight(60.px)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ImageElement(
                modifier = Modifier
                    .objectFit(ObjectFit.Contain)
                    .size(
                        when {
                            breakpoint > Breakpoint.LG -> 25.px
                            breakpoint >= Breakpoint.MD -> 20.px
                            else -> 15.px
                        }
                    ),
                src = iconLink.iconPath,
                alt = ""
            )
            Paragraph(
                modifier = Modifier.margin(top = 5.px),
                text = iconLink.itemName
            )
        }
    }
}