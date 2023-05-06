package com.example.mypokemons.ui.pokelist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.ui.res.stringResource
import com.example.mypokemons.R
import com.example.mypokemons.data.PokemonListItem
import com.example.mypokemons.ui.components.PokeList
import com.example.mypokemons.ui.theme.MyPokemonsTheme

class PokeListActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyPokemonsTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(title = { Text(text = stringResource(R.string.pokemons)) })
                    }
                ) { paddingValues ->
                    //TODO use space to add distances between elements (?)
                    PokeList(
                        paddingValues,
                        getPokemonList(),
                        clickAction = {
                            renderPokemonDetails()
                        })
                }
            }
        }
    }

    private fun getPokemonList():List<PokemonListItem> = listOf(
        PokemonListItem("Bulbasaur", ""),
        PokemonListItem("Pikachu", "sadfas"),
        PokemonListItem("Bulbasaur", ""),
        PokemonListItem("Pikachu", "sadfas"),
        PokemonListItem("Bulbasaur", ""),
        PokemonListItem("Pikachu", "sadfas"),
        PokemonListItem("Bulbasaur", ""),
        PokemonListItem("Pikachu", "sadfas"),
        PokemonListItem("Bulbasaur", ""),
        PokemonListItem("Pikachu", "sadfas"),
        PokemonListItem("Bulbasaur", ""),
        PokemonListItem("Pikachu", "sadfas"),
        PokemonListItem("Bulbasaur", ""),
        PokemonListItem("Pikachu", "sadfas"),
        PokemonListItem("Bulbasaur", ""),
        PokemonListItem("Pikachu", "sadfas"),
        PokemonListItem("Bulbasaur", ""),
        PokemonListItem("Pikachu", "sadfas"),
        PokemonListItem("Bulbasaur", ""),
        PokemonListItem("Pikachu", "sadfas"),
        PokemonListItem("Bulbasaur", ""),
        PokemonListItem("Pikachu", "sadfas"),
        PokemonListItem("Bulbasaur", ""),
        PokemonListItem("Pikachu", "sadfas"),
        PokemonListItem("Bulbasaur", ""),
        PokemonListItem("Pikachu", "sadfas"),
        PokemonListItem("Bulbasaur", ""),
        PokemonListItem("Pikachu", "sadfas"),
        PokemonListItem("Bulbasaur", ""),
        PokemonListItem("Pikachu", "sadfas"),
        PokemonListItem("Bulbasaur", ""),
        PokemonListItem("Pikachu", "sadfas"),
        PokemonListItem("Bulbasaur", ""),
        PokemonListItem("Pikachu", "sadfas")
    )

    private fun renderPokemonDetails() {

    }
}