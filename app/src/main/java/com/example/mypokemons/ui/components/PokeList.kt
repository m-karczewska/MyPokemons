package com.example.mypokemons.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mypokemons.data.PokemonListItem

@Composable
fun PokeList(
    paddingValues: PaddingValues,
    list: List<PokemonListItem>,
    clickAction: (String) -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
        color = MaterialTheme.colors.background
    ) {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
            userScrollEnabled = true,
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            itemsIndexed(list) { index, item ->
                PokeListItem(item.name, clickAction)
            }
        }
    }
}


@Preview
@Composable
fun PreviewList() {
    PokeList(PaddingValues(16.dp), listOf(PokemonListItem("Bulbasaur"))) {
        //do nothing
    }
}