package com.example.mypokemons.data.service

import com.example.mypokemons.data.model.NamedResourceList
import com.example.mypokemons.data.model.Pokemon
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class PokeApiRepositoryImpl(private val service: PokeApiService = PokeApiService.getInstance()) :
    PokeApiRepository {
    override fun getPokemonList(limit: Int, offset: Int): Flow<NamedResourceList> = flow {
        val responseApi = service.getPokemonList(limit, offset)
        emit(responseApi)

    }.flowOn(Dispatchers.IO)

    override fun getPokemonDetails(name: String): Flow<Pokemon> = flow {
        val responseApi = service.getPokemonDetails(name)
        emit(responseApi)
    }.flowOn(Dispatchers.IO)
}
