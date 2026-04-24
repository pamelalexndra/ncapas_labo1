package org.example.pokemons.repository;

import lombok.RequiredArgsConstructor;
import org.example.pokemons.common.PokemonList;
import org.example.pokemons.domain.entities.Pokemon;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PokemonRepository {
    private final PokemonList pokemonList;

    public List<Pokemon> getPokemons() {
        return pokemonList.getPokemons();
    }

}
