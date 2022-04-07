package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView listRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listRecView = findViewById(R.id.listRecView);
        listRecView.setLayoutManager(new LinearLayoutManager(this));

        String[] arr = {"c", "C++", "Java", "Python", "Django", "JS", "HTML5", "Bootstrap", "JQuery"};
        listRecView.setAdapter(new RecAdapter(arr));
    }
}