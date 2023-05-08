package com.example.mypokemons.ui.screens

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mypokemons.R
import com.example.mypokemons.ui.components.PokeList
import com.example.mypokemons.ui.pokelist.PokeListViewModel

@Composable
fun PokeListScreen(
    clickAction: (String) -> Unit,
    pokeListViewModel: PokeListViewModel = viewModel()
) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = stringResource(R.string.pokemons)) })
        }
    ) { paddingValues ->
        val list by pokeListViewModel.pokemonList.collectAsState()
        PokeList(
            paddingValues,
            list.results,
            clickAction
        )
    }
}