package com.example.notes.listeners;

import com.example.notes.entities.Note;

public interface NotesListener {
    Void onNoteClick(Note note, int position);

}
