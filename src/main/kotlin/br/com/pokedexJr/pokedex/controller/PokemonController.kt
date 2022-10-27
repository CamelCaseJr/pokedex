package br.com.pokedexJr.pokedex.controller

import br.com.pokedexJr.pokedex.form.PokemonForm
import br.com.pokedexJr.pokedex.model.Pokemon
import br.com.pokedexJr.pokedex.service.PokemonService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import java.util.Optional
import javax.validation.Valid

@RestController
@RequestMapping("/pokemon")
class PokemonController(private val service: PokemonService) {

    @GetMapping("/listar")
    fun listar(
    @RequestParam(required = false) nomePokemon: String?
    ) = service.listarTodos( nomePokemon)

    @PostMapping("/salvar")
    fun cadastrar(
    @RequestBody @Valid form: PokemonForm
    ):ResponseEntity<Pokemon>{
        val pokemon = service.created(form)
        return ResponseEntity.status(HttpStatus.OK).body(pokemon)
    }

    @PutMapping("/atualizar")
    fun atualizar(
        @RequestBody @Valid form: PokemonForm
    ):ResponseEntity<Pokemon>{
        val pokemon = service.buscarPorNome(form.nome)
        if (pokemon.isEmpty) return ResponseEntity.status(HttpStatus.NOT_FOUND).build() else
            return ResponseEntity.status(HttpStatus.OK).body(pokemon.get())
    }


}