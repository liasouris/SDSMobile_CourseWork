package com.example.softwaredevelopmentskillsmobile_coursework;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MoodHistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mood_history);

        //Gets the RecyclerView from the layout
        RecyclerView moodEntriesRecyclerView = findViewById(R.id.moodEntriesRV);
       // Sets the layout manager for the RecyclerView
        moodEntriesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
       // Creates an adapter for the RecyclerView
        MoodEntryListAdapter adapter = new MoodEntryListAdapter(MainActivity.moodEntries);
      // Sets the adapter for the RecyclerView
        moodEntriesRecyclerView.setAdapter(adapter);
    }
}
