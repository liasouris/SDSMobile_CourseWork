package com.example.softwaredevelopmentskillsmobile_coursework;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MoodEntryViewHolder extends RecyclerView.ViewHolder {
    TextView moodTextView;
    TextView timestampTextView;
    TextView journalTextView;

    public MoodEntryViewHolder(@NonNull View itemView) {
        super(itemView);
        moodTextView = itemView.findViewById(R.id.moodTV);
        timestampTextView = itemView.findViewById(R.id.timestampTV);
        journalTextView = itemView.findViewById(R.id.journalTV);
    }
}

