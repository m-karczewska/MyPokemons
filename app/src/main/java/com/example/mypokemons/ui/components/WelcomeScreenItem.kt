package com.example.mypokemons.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mypokemons.R

@Composable
fun WelcomeScreen(buttonAction: () -> Unit) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(dimensionResource(R.dimen.padding_default))
        ) {
            Text(
                text = stringResource(R.string.welcome_title),
                style = MaterialTheme.typography.h6,
            )
            Text(
                text = stringResource(R.string.welcome_text),
                style = MaterialTheme.typography.body1,
            )
            Button(
                onClick = buttonAction,
            ) {
                Text(
                    text = "Go to list",
                    style = MaterialTheme.typography.button
                )
            }
        }
    }
}

@Preview
@Composable
fun Preview() {
    WelcomeScreen() {
        //do nothing
    }
}