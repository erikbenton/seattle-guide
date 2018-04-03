package com.example.android.seattleguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

public class EntryActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entry_view);

        Gson gson = new Gson();
        String entryDataAsString = getIntent().getStringExtra("EntryInfo");
        Entry entry = gson.fromJson(entryDataAsString, Entry.class);

        TextView entryTitle = findViewById(R.id.entry_title);
        ImageView entryImage = findViewById(R.id.entry_image);
        TextView entryDescription = findViewById(R.id.entry_description);

        entryTitle.setText(entry.getTitle());
        //entryImage.setImageResource(entry.getImageResourceId());
        entryDescription.setText(entry.getDescription());
    }
}
