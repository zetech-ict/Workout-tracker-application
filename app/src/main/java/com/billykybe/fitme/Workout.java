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

public class Workout extends AppCompatActivity {
    public ArrayList<Workout_items_model> workout_list = new ArrayList<>();
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
        addItems(str_workout);

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
            startActivity(toWorkoutLobby);
            finish();
        });
    }

    public void getStrings() {
        str_workout = getIntent().getStringExtra("id");
    }

    public void addItems(String workout_name){
        switch (workout_name){
            case "fullbody-bg":
                workout_list.clear();
                workout_list.add(new Workout_items_model(R.raw.spaceman, "Kicks", "2.45"));
                workout_list.add(new Workout_items_model(R.raw.spaceman, "Kicks", "2.45"));
                workout_list.add(new Workout_items_model(R.raw.spaceman, "Kicks", "2.45"));
                workout_list.add(new Workout_items_model(R.raw.spaceman, "Kicks", "2.45"));
                workout_list.add(new Workout_items_model(R.raw.spaceman, "Kicks", "2.45"));



                break;
            case "arms-bg":
                workout_list.clear();
                workout_list.add(new Workout_items_model(R.raw.spaceman, "Kicks", "2.45"));
                workout_list.add(new Workout_items_model(R.raw.spaceman, "Kicks", "2.45"));
                workout_list.add(new Workout_items_model(R.raw.spaceman, "Kicks", "2.45"));
                workout_list.add(new Workout_items_model(R.raw.spaceman, "Kicks", "2.45"));
                break;
            case "abs-bg":
                workout_list.clear();
                workout_list.add(new Workout_items_model(R.raw.spaceman, "Kicks", "2.45"));
                workout_list.add(new Workout_items_model(R.raw.spaceman, "Kicks", "2.45"));
                workout_list.add(new Workout_items_model(R.raw.spaceman, "Kicks", "2.45"));

                break;
            case "chest-bg":
                workout_list.clear();
                workout_list.add(new Workout_items_model(R.raw.spaceman, "Kicks", "2.45"));
                workout_list.add(new Workout_items_model(R.raw.spaceman, "Kicks", "2.45"));
                workout_list.add(new Workout_items_model(R.raw.spaceman, "Kicks", "2.45"));
                workout_list.add(new Workout_items_model(R.raw.spaceman, "Kicks", "2.45"));
                workout_list.add(new Workout_items_model(R.raw.spaceman, "Kicks", "2.45"));
                workout_list.add(new Workout_items_model(R.raw.spaceman, "Kicks", "2.45"));
                break;

        }
    }
}