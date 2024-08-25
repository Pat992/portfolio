package com.pat.portfolio.components.projectPage

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.ImageElement
import com.pat.portfolio.components._widgets.buttons.LinkElement
import com.pat.portfolio.components._widgets.text.Paragraph
import com.pat.portfolio.models.IconLinks
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.size
import org.jetbrains.compose.web.css.px

@Composable
fun ToolLinkItem(iconLink: IconLinks) {
    Box(
        modifier = Modifier.height(60.px),
    ) {
        LinkElement(
            path = iconLink.url
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ImageElement(
                    modifier = Modifier.size(25.px),
                    src = iconLink.iconPath,
                    alt = ""
                )
                Paragraph(
                    modifier = Modifier.margin(left = 5.px),
                    text = iconLink.itemName
                )
            }
        }
    }
}