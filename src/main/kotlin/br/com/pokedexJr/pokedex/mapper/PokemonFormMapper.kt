package br.com.pokedexJr.pokedex.mapper

import br.com.pokedexJr.pokedex.form.PokemonForm
import br.com.pokedexJr.pokedex.model.Pokemon

class PokemonFormMapper():Mapper<PokemonForm, Pokemon> {
    override fun map(t: PokemonForm): Pokemon {
        return Pokemon(
            numero = t.numero,
            nome = t.nome,
            descricao = t.descricao,
            forca = t.forca,
            imagem = t.imagem,
            tipo = t.tipo
        )
    }

}