package com.example.softwaredevelopmentskillsmobile_coursework;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MoodEntryListAdapter extends RecyclerView.Adapter<MoodEntryViewHolder> {
    private ArrayList<MoodEntry> moodEntries;
    public MoodEntryListAdapter(ArrayList<MoodEntry> moodEntries) {
        this.moodEntries = moodEntries;

    }

    @NonNull
    @Override
    public MoodEntryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mood_entry_view, parent, false);
        return new MoodEntryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoodEntryViewHolder holder, int position) {
        // Gets the mood entry at the current position
        MoodEntry entry = moodEntries.get(position);
        holder.moodTextView.setText(entry.getMood());
        holder.timestampTextView.setText(entry.getTimestamp());
        holder.journalTextView.setText(entry.getJournalText());

    }

    @Override
    public int getItemCount() {

        return moodEntries.size();
    }
}
