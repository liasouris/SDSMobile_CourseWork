package com.example.core_elements;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.textView);

        // Checks if intent has extra and sets text to it
        if (getIntent().hasExtra("org.core_elements.key")) {
            String text = getIntent().getStringExtra("org.core_elements.key");
            textView.setText(text);
        }
    }
}