package com.example.mypokemons.ui.pokelist

import androidx.lifecycle.ViewModel
import com.example.mypokemons.data.PokemonList
import com.example.mypokemons.data.PokemonListItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class PokeListViewModel : ViewModel() {

    private val _pokemonList = MutableStateFlow(PokemonList())
    val pokemonList: StateFlow<PokemonList> = _pokemonList.asStateFlow()

    init {
        _pokemonList.value = PokemonList(
            listOf(
                PokemonListItem("Bulbasaur"),
                PokemonListItem("Pikachu"),
                PokemonListItem("Bulbasaur"),
                PokemonListItem("Pikachu"),
                PokemonListItem("Bulbasaur"),
                PokemonListItem("Pikachu"),
                PokemonListItem("Bulbasaur"),
                PokemonListItem("Pikachu"),
                PokemonListItem("Bulbasaur"),
                PokemonListItem("Pikachu"),
                PokemonListItem("Bulbasaur"),
                PokemonListItem("Pikachu"),
                PokemonListItem("Bulbasaur"),
                PokemonListItem("Pikachu"),
                PokemonListItem("Bulbasaur"),
                PokemonListItem("Pikachu"),
                PokemonListItem("Bulbasaur"),
                PokemonListItem("Pikachu"),
                PokemonListItem("Bulbasaur"),
                PokemonListItem("Pikachu"),
                PokemonListItem("Bulbasaur"),
                PokemonListItem("Pikachu"),
                PokemonListItem("Bulbasaur"),
                PokemonListItem("Pikachu"),
                PokemonListItem("Bulbasaur"),
                PokemonListItem("Pikachu"),
                PokemonListItem("Bulbasaur"),
                PokemonListItem("Pikachu"),
                PokemonListItem("Bulbasaur"),
                PokemonListItem("Pikachu"),
                PokemonListItem("Bulbasaur"),
                PokemonListItem("Pikachu"),
                PokemonListItem("Bulbasaur"),
                PokemonListItem("Pikachu")
            )
        )
    }
}