package com.example.mypokemons.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.example.mypokemons.R

@Composable
fun PokeListItem(name: String, clickAction: (String) -> Unit) {
    Surface(
        shape = RoundedCornerShape(dimensionResource(R.dimen.pokemon_list_item_corner)),
        elevation = dimensionResource(R.dimen.elevation_default)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .background(color = MaterialTheme.colors.secondary)
                .clickable { clickAction(name) }
                .padding(dimensionResource(R.dimen.padding_small))
        ) {
            PokeAvatar(name)
            Spacer(modifier = Modifier.size(dimensionResource(R.dimen.padding_default)))
            Text(
                text = name,
                style = MaterialTheme.typography.caption
            )
        }
    }
}

@Composable
fun PokeAvatar(
    name: String,
    size: Dp = dimensionResource(R.dimen.pokemon_avatar_size)
) {
    Box(
        Modifier
            .size(size),
        contentAlignment = Alignment.Center
    ) {
        val color = colorResource(id = R.color.teal_700)
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawCircle(SolidColor(color))
        }
        Text(
            text = name.first().toString(),
            style = MaterialTheme.typography.body1
        )
    }
}

@Preview
@Composable
fun PreviewListItem() {
    PokeListItem(name = "Bulbasaur") {
        //do nothing
    }
}