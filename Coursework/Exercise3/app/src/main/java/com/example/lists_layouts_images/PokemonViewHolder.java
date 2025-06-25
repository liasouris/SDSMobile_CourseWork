package com.example.lists_layouts_images;

import android.app.ActivityOptions;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PokemonViewHolder extends RecyclerView.ViewHolder {
    public TextView name;
    public TextView price;
    public TextView power;


    public PokemonViewHolder(@NonNull View itemView) {
        //Initializes the views
        super(itemView);
        name = itemView.findViewById(R.id.pokemonName);
        price = itemView.findViewById(R.id.pokemonPrice);
        power = itemView.findViewById(R.id.pokemonPower);
    }

    //Binds Pokemon data to the views and sets up OnClickListener
    public void bind(Pokemon pokemon, int position) {
        name.setText(pokemon.getName());
        price.setText(pokemon.getPrice());
        power.setText(pokemon.getPower());

    //Starts ImageViewActivity when a Pokemon item is clicked
        itemView.setOnClickListener(v -> {
            Intent intent = new Intent(itemView.getContext(), ImageViewActivity.class);
            //Pass the position of the clicked Pokemon to ImageViewActivity
            intent.putExtra("imageIndex", position);
            itemView.getContext().startActivity(intent);
        });
    }
}