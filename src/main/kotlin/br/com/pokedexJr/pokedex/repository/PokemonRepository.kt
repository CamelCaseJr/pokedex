package br.com.pokedexJr.pokedex.repository

import br.com.pokedexJr.pokedex.model.Pokemon
import org.springframework.data.geo.GeoResult
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface PokemonRepository: JpaRepository<Pokemon, UUID> {

    fun findByPokemonNome(nomePokemon: String): List<Pokemon>

}