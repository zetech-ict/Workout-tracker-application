package com.billykybe.fitme;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import java.util.ArrayList;
import java.util.List;

public class Workout extends AppCompatActivity {
    public List<Workout_items_model> workout_list = new ArrayList<>();
    TextView startBtn,workoutData;
    RecyclerView rv_workouts;
    workout_item_adapter workout_item_adapter;

    String str_workout = "";

    @SuppressLint("NotifyDataSetChanged")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );


        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);;


workoutData = findViewById(R.id.workoutdata);


        getStrings();
        WorkoutsDB workoutsDB = new WorkoutsDB(str_workout);
        workout_list = workoutsDB.getList();

        Toast.makeText(getApplicationContext(), str_workout, Toast.LENGTH_LONG).show();
        int wSize = workout_list.size();
        int wTime = workoutTime(workout_list);

        workoutData.setText(wTime+ " mins "+wSize+" workouts");
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

    private int workoutTime(List<Workout_items_model> workout_list) {
        int wTime = 0;
        for (int i = 0; i < workout_list.size(); i++) {
            wTime +=Integer.parseInt( workout_list.get(i).w_duration);

        }
        wTime = wTime/60;

        return wTime;
    }

    public void getStrings() {
        str_workout = getIntent().getStringExtra("id");
    }


}