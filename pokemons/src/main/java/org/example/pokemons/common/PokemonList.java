package org.example.pokemons.common;

import org.example.pokemons.domain.entities.Pokemon;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PokemonList {
    private final List<Pokemon> pokemons;

    public PokemonList() {
        this.pokemons = new ArrayList<>();

        this.pokemons.add(Pokemon.builder()
                .nombre("Charmander")
                .tipo("Fuego")
                .debilidades(List.of("Agua", "Roca", "Tierra"))
                .zonas(List.of("Cueva", "Montaña"))
                .region("Kanto")
                .build());

        this.pokemons.add(Pokemon.builder()
                .nombre("Squirtle")
                .tipo("Agua")
                .debilidades(List.of("Planta", "Eléctrico"))
                .zonas(List.of("Lago", "Mar", "Río"))
                .region("Kanto")
                .build());

        this.pokemons.add(Pokemon.builder()
                .nombre("Pikachu")
                .tipo("Eléctrico")
                .debilidades(List.of("Tierra"))
                .zonas(List.of("Bosque", "Hierba Alta"))
                .region("Kanto")
                .build());

        this.pokemons.add(Pokemon.builder()
                .nombre("Mudkip")
                .tipo("Agua")
                .debilidades(List.of("Planta", "Eléctrico"))
                .zonas(List.of("Lago", "Río"))
                .region("Hoenn")
                .build());
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}


