package br.com.pokedexJr.pokedex.form

import br.com.pokedexJr.pokedex.model.Tipo
import java.math.BigDecimal

class PokemonForm (
    val numero: Int,
    val nome : String,
    val descricao : String,
    val forca : BigDecimal,
    val imagem: String,
    val tipo: Tipo
    )
