package br.com.pokedexJr.pokedex.mapper

interface Mapper<T,U> {
    fun map(t:T):U
}