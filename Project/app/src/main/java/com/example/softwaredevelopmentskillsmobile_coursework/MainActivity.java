package com.example.softwaredevelopmentskillsmobile_coursework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private RadioGroup moodRadioGroup;
    private EditText journalEditText;
    private Button saveButton;
    private Button historyButton;
    // Stores the mood entries
    public static ArrayList<MoodEntry> moodEntries = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        moodRadioGroup = findViewById(R.id.moodRG);
        journalEditText = findViewById(R.id.journalET);
        saveButton = findViewById(R.id.saveButton);
        historyButton = findViewById(R.id.historyButton);

        // Saves the mood entry when the save button is clicked
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveMoodEntry();

            }
        });
        //Starts the MoodHistoryActivity after clicking the button
        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MoodHistoryActivity.class);
                startActivity(intent);

            }

        });
    }

    private void saveMoodEntry() {
        // Get selected mood
        int selectedId = moodRadioGroup.getCheckedRadioButtonId();
        if (selectedId == -1) {
            Toast.makeText(this, "Please select a mood", Toast.LENGTH_SHORT).show();
            return;
        }

        RadioButton selectedMood = findViewById(selectedId);
        String moodText = selectedMood.getText().toString();

        // Gets the journal entry
        String journalText = journalEditText.getText().toString().trim();
        if (journalText.isEmpty()) {
            Toast.makeText(this, "Please write something about your day", Toast.LENGTH_SHORT).show();
            return;
        }

        // Gets timestamp
        String timestamp = new SimpleDateFormat("dd-MM-yyyy HH:mm", Locale.getDefault()).format(new Date());

        // Creates the MoodEntry object
        MoodEntry entry = new MoodEntry(moodText, timestamp, journalText);
        moodEntries.add(entry);
        Toast.makeText(this, "Mood saved!", Toast.LENGTH_SHORT).show();

        // Clears form after user saves entry
        moodRadioGroup.clearCheck();
        journalEditText.setText("");
    }
}
