package com.billykybe.fitme;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Workout extends AppCompatActivity {
    public List<Workout_items_model> workout_list = new ArrayList<>();
    TextView startBtn;
    Toolbar toolbar;
    RecyclerView rv_workouts;
    workout_item_adapter workout_item_adapter;

    String str_workout = "";

    @SuppressLint("NotifyDataSetChanged")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        toolbar = findViewById(R.id.colapsbar);
        setSupportActionBar(toolbar);

        getStrings();
        WorkoutsDB workoutsDB = new WorkoutsDB(str_workout);
        workout_list = workoutsDB.getList();

        Toast.makeText(getApplicationContext(), str_workout, Toast.LENGTH_LONG).show();

        rv_workouts = findViewById(R.id.rv_workout);
        rv_workouts.setLayoutManager(new LinearLayoutManager(this));
        workout_item_adapter = new workout_item_adapter(workout_list);
        rv_workouts.setAdapter(workout_item_adapter);

        workout_item_adapter.notifyDataSetChanged();

        // to start workout activity

        startBtn = findViewById(R.id.startbtn);

        startBtn.setOnClickListener(v -> {
            Intent toWorkoutLobby = new Intent(getApplicationContext(), StartWorkouts.class);
            toWorkoutLobby.putExtra("id",str_workout);
            startActivity(toWorkoutLobby);
            finish();
        });
    }

    public void getStrings() {
        str_workout = getIntent().getStringExtra("id");
    }


}