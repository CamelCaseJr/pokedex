package br.com.pokedexJr.pokedex.repository

import br.com.pokedexJr.pokedex.model.Pokemon
import org.springframework.data.geo.GeoResult
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional
import java.util.UUID

@Repository
interface PokemonRepository: JpaRepository<Pokemon, UUID> {

    fun findByPokemonNome(nomePokemon: String): Optional<Pokemon>

}