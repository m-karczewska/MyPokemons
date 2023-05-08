package com.example.mypokemons.data.service

import com.example.mypokemons.data.model.NamedResourceList
import com.example.mypokemons.data.model.Pokemon
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApiService {
    @GET("pokemon/")
    suspend fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): NamedResourceList

    @GET("pokemon/{name}")
    suspend fun getPokemonDetails(
        @Path("name") name: String
    ): Pokemon

    companion object {
        private var pokeApiService: PokeApiService? = null
        fun getInstance() : PokeApiService {
            if (pokeApiService == null) {
                val client = OkHttpClient
                    .Builder()
                    .build()
                val retrofit = Retrofit.Builder()
                    .baseUrl(
                        HttpUrl.parse("https://pokeapi.co/api/v2/")!!)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build()
                pokeApiService = retrofit.create(PokeApiService::class.java)
            }
            return pokeApiService!!
        }
    }
}