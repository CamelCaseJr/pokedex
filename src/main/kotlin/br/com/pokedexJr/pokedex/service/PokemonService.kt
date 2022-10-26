package br.com.pokedexJr.pokedex.service

import br.com.pokedexJr.pokedex.form.PokemonForm
import br.com.pokedexJr.pokedex.mapper.PokemonFormMapper
import br.com.pokedexJr.pokedex.model.Pokemon
import br.com.pokedexJr.pokedex.repository.PokemonRepository
import org.springframework.stereotype.Service

@Service
class PokemonService (
    private val repository: PokemonRepository,
    private val mapper: PokemonFormMapper
        ) {
    fun listarTodos(
        nomePokemon: String?
    ): List<Pokemon> {
        val pokemons  = nomePokemon?.let {
            repository.findByPokemonNome(nomePokemon) } ?: repository.findAll()
        return pokemons
    }

    fun created(form: PokemonForm): Pokemon {
        return mapper.map(form)
    }
}