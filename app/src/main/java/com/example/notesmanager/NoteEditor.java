package com.example.notesmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class NoteEditor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_editor);

        EditText editText = findViewById(R.id.editText);

        Intent intent = getIntent();
        int noteId = intent.getIntExtra("noteID", -1);


    }
}
