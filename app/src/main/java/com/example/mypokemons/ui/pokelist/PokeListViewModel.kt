package com.example.mypokemons.ui.pokelist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mypokemons.data.model.NamedResourceList
import com.example.mypokemons.data.service.PokeApiRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class PokeListViewModel : ViewModel() {

    private val _pokemonList = MutableStateFlow(NamedResourceList())
    val pokemonList: StateFlow<NamedResourceList> = _pokemonList.asStateFlow()

    init {
        val repository = PokeApiRepositoryImpl()
        viewModelScope.launch {
            repository.getPokemonList().collect { response ->
                _pokemonList.value = response
            }
        }
    }
}