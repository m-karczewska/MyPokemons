package com.example.mypokemons.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import com.example.mypokemons.ui.pokelist.PokeListActivity
import com.example.mypokemons.ui.screens.WelcomeScreen
import com.example.mypokemons.ui.theme.MyPokemonsTheme

class WelcomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setWelcomeContent()
    }

    private fun setWelcomeContent() {
        setContent {
            MyPokemonsTheme {
                Surface() {
                    WelcomeScreen(buttonAction = {
                        goToPokemonList()
                    })
                }
            }
        }
    }

    private fun goToPokemonList() {
        with(Intent(this, PokeListActivity::class.java)) {
            startActivity(this)
        }
    }
}