package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Bookmarked extends AppCompatActivity {
    RecyclerView favorite_rv;
    List<favorite_model> favorites = new ArrayList<>();
    favorite_adapter favorite_adapter;
    @SuppressLint("NotifyDataSetChanged")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmarked);

        favorite_rv = findViewById(R.id.favorite_rv);


        favorite_rv.setLayoutManager(new LinearLayoutManager(this));
        favorite_adapter = new favorite_adapter(favorites);
        favorite_rv.setAdapter(favorite_adapter);


        favorites.add(new favorite_model(R.drawable.cover_fullbody,R.drawable.ic_level_2,"Full Body Advanced","15 Minutes"));
        favorites.add(new favorite_model(R.drawable.cover_arm_1,R.drawable.ic_level_1,"Arm Begginer","15 Minutes"));
        favorites.add(new favorite_model(R.drawable.cover_fullbody,R.drawable.ic_level_2,"Full Body Advanced","15 Minutes"));
        favorites.add(new favorite_model(R.drawable.cover_chest_1,R.drawable.ic_level_2,"Full Body Advanced","15 Minutes"));
        favorites.add(new favorite_model(R.drawable.cover_leg_3,R.drawable.ic_level_2,"Full Body Advanced","15 Minutes"));
        favorites.add(new favorite_model(R.drawable.cover_fullbody,R.drawable.ic_level_2,"Full Body Advanced","15 Minutes"));
        favorite_adapter.notifyDataSetChanged();


    }
}