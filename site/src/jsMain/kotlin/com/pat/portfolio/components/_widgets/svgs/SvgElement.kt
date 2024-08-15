package com.pat.portfolio.components._widgets.svgs

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.dom.svg.Path
import com.varabyte.kobweb.compose.dom.svg.Svg
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun SvgElement(
    path: String,
    height: Double,
    width: Double,
    color: String,
    viewBoxValue: String,
    modifier: Modifier = Modifier
) {
    Svg(
        attrs = modifier
            .height(height.px)
            .width(width.px)
            .toAttrs {
                attr("viewBox", viewBoxValue)
            }
    ) {
        Path(
            attrs = Modifier
                .styleModifier {
                    property("stroke", color)
                }
                .size(0.95.percent)
                .toAttrs {
                    attr("fill", color)
                    attr("d", path)
                    attr("stroke-width", "2")
                    attr("stroke-linecap", "round")
                    attr("stroke-linejoin", "round")
                }
        )
    }
}