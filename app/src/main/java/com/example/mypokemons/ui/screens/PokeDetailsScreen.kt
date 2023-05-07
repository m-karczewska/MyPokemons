package com.example.mypokemons.ui.components

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mypokemons.ui.pokedetails.PokeDetailsViewModel

@Composable
fun PokeDetailsScreen(
    viewModel: PokeDetailsViewModel = viewModel()
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

/*
@Composable // stateful
fun FeatureSecondContent(viewModel: FeatureSecondViewModel) {
    val uiStateFlow by viewModel.uiStateFlow.collectAsState()
    val uiState by viewModel.uiState

    FeatureSecondContent(
        uiStateFlow = uiStateFlow,
        uiState = uiState,
        incrementUiStateFlowInteger = viewModel::incrementUiStateFlowInteger,
        downloadDataFromRepository = viewModel::downloadDataFromRepository,
    )
}
*/