package com.pat.portfolio.components._widgets.buttons

import androidx.compose.runtime.Composable
import com.pat.portfolio.components._widgets.ImageElement
import com.pat.portfolio.components._widgets.text.Paragraph
import com.pat.portfolio.models.IconLinks
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.px

@Composable
fun HorizontalLinkItem(
    iconLink: IconLinks
) {
    val breakpoint = rememberBreakpoint()
    LinkElement(
        path = iconLink.url
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
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
                modifier = Modifier.margin(left = 5.px).textAlign(TextAlign.Left),
                text = iconLink.itemName
            )
        }
    }
}