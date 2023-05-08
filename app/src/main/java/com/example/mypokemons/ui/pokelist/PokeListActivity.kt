package com.example.mypokemons.ui.pokelist

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.mypokemons.ui.pokedetails.PokeDetailsActivity
import com.example.mypokemons.ui.screens.PokeListScreen
import com.example.mypokemons.ui.theme.MyPokemonsTheme

class PokeListActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyPokemonsTheme {
                PokeListScreen({
                    renderPokemonDetails(name = it)
                })
            }
        }
    }

    private fun renderPokemonDetails(name: String) {
        with(Intent(this, PokeDetailsActivity::class.java)) {
            putExtra(PokeDetailsActivity.POKEMON_NAME_EXTRA, name)
            startActivity(this)
        }
    }
}