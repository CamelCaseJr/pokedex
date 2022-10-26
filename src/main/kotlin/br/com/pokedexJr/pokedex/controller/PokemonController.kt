package br.com.pokedexJr.pokedex.controller

import br.com.pokedexJr.pokedex.form.PokemonForm
import br.com.pokedexJr.pokedex.model.Pokemon
import br.com.pokedexJr.pokedex.service.PokemonService
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import javax.validation.Valid


class PokemonController(private val service: PokemonService) {

    fun listar(
    @RequestParam(required = false) nomePokemon: String?
    ) = service.listarTodos( nomePokemon)

    fun cadastrar(
    @RequestBody @Valid form: PokemonForm
    ):ResponseEntity<Pokemon>{
        val pokemon = service.created(form)
    }


}