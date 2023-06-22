package com.example.assignment1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Mainrecycler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler);

        RecyclerView recycler = findViewById(R.id.rec);

        String[] captions = new String[Frame.frames.length];
        int[] ids = new int[Frame.frames.length];

        for(int i = 0; i<captions.length;i++){
            captions[i] = Frame.frames[i].getName();
            ids[i] = Frame.frames[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, ids);
        recycler.setAdapter(adapter);
    }
}
