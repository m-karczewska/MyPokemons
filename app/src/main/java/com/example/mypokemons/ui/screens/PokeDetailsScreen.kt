package com.example.mypokemons.ui.screens

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mypokemons.ui.components.PokeDetailsView
import com.example.mypokemons.ui.pokedetails.PokeDetailsViewModel
import com.example.mypokemons.ui.pokedetails.PokeDetailsViewModelFactory

@Composable
fun PokeDetailsScreen(
    pokemonName: String,
    viewModel: PokeDetailsViewModel = viewModel(factory = PokeDetailsViewModelFactory(pokemonName))
) {
    val pokemon by viewModel.pokemon.collectAsState()
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = pokemon.name) })
        }
    ) { paddingValues ->
        PokeDetailsView(
            paddingValues,
            pokemon
        )
    }
}