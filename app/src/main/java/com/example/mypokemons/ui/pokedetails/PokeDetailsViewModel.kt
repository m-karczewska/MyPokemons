package com.example.mypokemons.ui.pokedetails

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.mypokemons.data.model.Pokemon
import com.example.mypokemons.data.service.PokeApiRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class PokeDetailsViewModel(private val pokemonName: String) : ViewModel() {

    private var _pokemon = MutableStateFlow(Pokemon())
    val pokemon: StateFlow<Pokemon> = _pokemon.asStateFlow()

    init {
        val repository = PokeApiRepositoryImpl()
        viewModelScope.launch {
            repository.getPokemonDetails(pokemonName).collect { response ->
                _pokemon.value = response
            }
        }
    }
}

class PokeDetailsViewModelFactory(private val name: String) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T = PokeDetailsViewModel(name) as T
}