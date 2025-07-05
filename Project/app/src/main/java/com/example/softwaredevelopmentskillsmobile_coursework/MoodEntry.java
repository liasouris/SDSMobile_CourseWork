package com.example.softwaredevelopmentskillsmobile_coursework;

public class MoodEntry {
    private String mood;
    private String timestamp;
    private String journalText;

    public MoodEntry(String mood, String timestamp, String journalText) {
        this.mood = mood;
        this.timestamp = timestamp;
        this.journalText = journalText;
    }

    public String getMood() {

        return mood;
    }

    public String getTimestamp() {

        return timestamp;
    }

    public String getJournalText() {

        return journalText;
    }

}
