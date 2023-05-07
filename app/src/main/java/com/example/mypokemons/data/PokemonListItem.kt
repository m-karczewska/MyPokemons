package com.example.mypokemons.data

data class PokemonListItem(
    val name: String
) {
    //TODO consider storing id retrieved from URL
}
data class PokemonList(
    val pokemons: List<PokemonListItem> = emptyList()
) {
    //TODO consider storing id retrieved from URL
}

fun NamedResource.toPokemonListItem() = PokemonListItem(this.name)
fun NamedResourceList.toPokemonList() = PokemonList(this.results.map { item -> item.toPokemonListItem() })

