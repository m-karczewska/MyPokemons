package com.example.mypokemons.data.service

import com.example.mypokemons.data.model.NamedResourceList
import com.example.mypokemons.data.model.Pokemon
import kotlinx.coroutines.flow.Flow

interface PokeApiRepository {
    fun getPokemonList(limit: Int = 20, offset: Int = 0): Flow<NamedResourceList>

    fun getPokemonDetails(name: String): Flow<Pokemon>
}