package com.example.mypokemons.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mypokemons.R
import com.example.mypokemons.data.model.NamedResource
import com.example.mypokemons.data.model.NamedResourceList

@Composable
fun PokeList(
    paddingValues: PaddingValues,
    list: List<NamedResource>,
    clickAction: (String) -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
        color = MaterialTheme.colors.background
    ) {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(
                dimensionResource(R.dimen.spacing_defailt),
                Alignment.Top
            ),
            userScrollEnabled = true,
            contentPadding = PaddingValues(
                horizontal = dimensionResource(R.dimen.padding_default),
                vertical = dimensionResource(R.dimen.padding_small)
            )
        ) {
            items(list) { item ->
                PokeListItem(item.name, clickAction)
            }
        }
    }
}


@Preview
@Composable
fun PreviewList() {
    PokeList(PaddingValues(16.dp), listOf(NamedResource("Bulbasaur"))) {
        //do nothing
    }
}