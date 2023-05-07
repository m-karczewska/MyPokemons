package com.example.mypokemons.ui.pokedetails

import androidx.lifecycle.ViewModel
import com.example.mypokemons.data.Ability
import com.example.mypokemons.data.NamedResource
import com.example.mypokemons.data.Pokemon
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class PokeDetailsViewModel : ViewModel() {

    private var _pokemon = MutableStateFlow(Pokemon())
    val pokemon: StateFlow<Pokemon> = _pokemon.asStateFlow()

    init {
        //TODO request Pokemon
        _pokemon.value = Pokemon(
            2,
            "Bulbasaur",
            abilities = arrayListOf(Ability(NamedResource("speed", ""), false, 1),),
            height = 5
        )
    }
}