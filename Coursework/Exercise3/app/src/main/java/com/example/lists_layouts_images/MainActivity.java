package com.example.lists_layouts_images;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView PokemonRV;
    private PokemonListAdapter adapter;
    private ArrayList<Pokemon> pokemonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PokemonRV = findViewById(R.id.PokemonRV);
        PokemonRV.setLayoutManager(new LinearLayoutManager(this));

        pokemonList = new ArrayList<>();
        //Get the arrays from strings.xml
        String[] names = getResources().getStringArray(R.array.pokemon_names);
        String[] prices = getResources().getStringArray(R.array.pokemon_prices);
        String[] powers = getResources().getStringArray(R.array.pokemon_powers);

        //Add Pokemon objects to the list
        for (int i = 0; i < names.length; i++) {
            pokemonList.add(new Pokemon(names[i], prices[i], powers[i]));
        }
        adapter = new PokemonListAdapter(pokemonList);
        PokemonRV.setAdapter(adapter);

    }
}