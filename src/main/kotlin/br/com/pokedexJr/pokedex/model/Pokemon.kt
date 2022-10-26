package br.com.pokedexJr.pokedex.model


import java.math.BigDecimal
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Pokemon(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : UUID? = null,
    val numero: Int,
    val nome : String,
    val descricao : String,
    val forca : BigDecimal,
    val imagem: String,
    val tipo: Tipo
)


