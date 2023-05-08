package com.example.mypokemons.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.mypokemons.R
import com.example.mypokemons.data.model.Pokemon

@Composable
fun PokeDetailsView(paddingValues: PaddingValues, pokemon: Pokemon) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
        color = MaterialTheme.colors.background
    ) {
        Column {
//            Text(text = pokemon.name, style = MaterialTheme.typography.h3)
            if (pokemon.abilities.isNotEmpty()) {
                InfoRow(
                    title = stringResource(id = R.string.abilities),
                    data = pokemon.abilities.map { ability -> ability.ability.name }.toString()
                )
            }
            if (pokemon.height != null) {
                InfoRow(
                    title = stringResource(id = R.string.height),
                    data = pokemon.height.toString()
                )
            }
        }
    }
}

@Composable
fun InfoRow(title: String, data: String) {
    Row {
        Text(text = title, style = MaterialTheme.typography.h6)
    }
    Row {
        Text(text = data)
    }
}

@Preview
@Composable
fun PreviewPokeDetails() {
    PokeDetailsView(paddingValues = PaddingValues(), pokemon = Pokemon(0, "Bulbasaur"))
}