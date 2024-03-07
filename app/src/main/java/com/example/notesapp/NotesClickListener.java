package com.example.notesapp;

import androidx.cardview.widget.CardView;

import com.example.notesapp.Models.Notes;

public abstract class NotesClickListener {
    public void onClick(Notes notes){}
    public void onLongClick(Notes notes, CardView cardView) {}

}
