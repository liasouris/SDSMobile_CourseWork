package com.example.lists_layouts_images;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ImageViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        ImageView pokemonImage = findViewById(R.id.imageView);
        //Get the image index from the intent
        int imageIndex = getIntent().getIntExtra("imageIndex", 0);
        int imageResId = getImageResource(imageIndex);
        pokemonImage.setImageResource(imageResId);
        //Set up OnClickListener to finish the activity
        pokemonImage.setOnClickListener(v -> finish());
    }

    //Helper method to get the image resource based on its index
    private int getImageResource(int i) {
        switch (i) {
            case 0: return R.drawable.pikachu_image;
            case 1: return R.drawable.charmander_image;
            case 2: return R.drawable.squirtle_image;
            default: return R.drawable.ic_launcher_foreground;
        }
    }
}