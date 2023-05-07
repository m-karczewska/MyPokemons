package com.example.mypokemons.ui.pokedetails

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.mypokemons.ui.components.PokeDetailsScreen
import com.example.mypokemons.ui.theme.MyPokemonsTheme

class PokeDetailsActivity : ComponentActivity() {

    private val pokemonName by lazy { intent.getStringExtra(POKEMON_NAME_EXTRA) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyPokemonsTheme {
                PokeDetailsScreen()
            }
        }
    }

    companion object {
        const val POKEMON_NAME_EXTRA = "POKEMON_NAME_EXTRA"
    }
}