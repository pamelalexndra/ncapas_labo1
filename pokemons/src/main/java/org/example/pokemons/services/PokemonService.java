package org.example.pokemons.services;

import lombok.RequiredArgsConstructor;
import org.example.pokemons.domain.entities.Pokemon;
import org.example.pokemons.repository.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    public List<Pokemon> getAllProducts() {
        return pokemonRepository.getPokemons();
    }

    public List<Pokemon> filtrarPorTipo(String tipo) {
        return pokemonRepository.getPokemons().stream()
                .filter(pokemon -> pokemon.getTipo().equalsIgnoreCase(tipo))
                .toList();
    }

    public List<Pokemon> filtrarPorZona(String zona) {
        return pokemonRepository.getPokemons().stream()
                .filter(pokemon -> pokemon.getZonas().contains(zona))
                .toList();
    }

    public List<Pokemon> filtrarPorDebilidad(String debilidad) {
        return pokemonRepository.getPokemons().stream()
                .filter(pokemon -> pokemon.getDebilidades().contains(debilidad))
                .toList();
    }
}