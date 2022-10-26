package br.com.pokedexJr.pokedex.service

import br.com.pokedexJr.pokedex.form.PokemonForm
import br.com.pokedexJr.pokedex.model.Pokemon
import br.com.pokedexJr.pokedex.repository.PokemonRepository
import org.springframework.beans.BeanUtils

class PokemonService (
    private val repository: PokemonRepository
        ) {
    fun listarTodos(
        nomePokemon: String?
    ): List<Pokemon> {
        val pokemons  = nomePokemon?.let { repository.findByPokemonNome(nomePokemon) }?: repository.findAll()
        return pokemons
    }

    fun created(form: PokemonForm): Pokemon {
        return pokemon
    }
}