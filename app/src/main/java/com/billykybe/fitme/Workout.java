package com.billykybe.fitme;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Workout extends AppCompatActivity {
    public List<Workout_items_model> workout_list = new ArrayList<>();
    TextView startBtn, workoutData;
    RecyclerView rv_workouts;
    workout_item_adapter workout_item_adapter;
    ImageView imgWork;
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
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);
        ;


        workoutData = findViewById(R.id.workoutdata);

        imgWork=findViewById(R.id.imgWork);

        getStrings();
        WorkoutsDB workoutsDB = new WorkoutsDB(str_workout);
        workout_list = workoutsDB.getList();
        initImages(str_workout);
//        Toast.makeText(getApplicationContext(), str_workout, Toast.LENGTH_LONG).show();
        int wSize = workout_list.size();
        int wTime = workoutTime(workout_list);

        workoutData.setText(wTime + " mins " + wSize + " workouts");
        rv_workouts = findViewById(R.id.rv_workout);
        rv_workouts.setLayoutManager(new LinearLayoutManager(this));
        workout_item_adapter = new workout_item_adapter(workout_list);
        rv_workouts.setAdapter(workout_item_adapter);

        workout_item_adapter.notifyDataSetChanged();

        // to start workout activity

        startBtn = findViewById(R.id.startbtn);

        startBtn.setOnClickListener(v -> {
            Intent toWorkoutLobby = new Intent(getApplicationContext(), StartWorkouts.class);
            toWorkoutLobby.putExtra("id", str_workout);
            startActivity(toWorkoutLobby);
            finish();
        });
    }

    private int workoutTime(List<Workout_items_model> workout_list) {
        int wTime = 0;
        for (int i = 0; i < workout_list.size(); i++) {
            wTime += Integer.parseInt(workout_list.get(i).w_duration);

        }
        wTime = wTime / 60;

        return wTime;
    }

    public void getStrings() {
        str_workout = getIntent().getStringExtra("id");
    }


    private void initImages(String key) {
//=====> Male set
        if (key.contains("full")) {
            imgWork.setImageResource(R.drawable.cover_fullbody);

        }

        if (key.contains("hes") && key.contains("bg")) {
            imgWork.setImageResource(R.drawable.cover_chest_1);


        }
        if (key.contains("hes") && key.contains("im")) {
            imgWork.setImageResource(R.drawable.cover_chest_2);


        }
        if (key.contains("hes") && key.contains("ad")) {
            imgWork.setImageResource(R.drawable.cover_chest_3);

        }




        if (key.contains("abs") && key.contains("bg")) {


            imgWork.setImageResource(R.drawable.cover_abs_1);


        }
        if (key.contains("abs") && key.contains("im")) {  imgWork.setImageResource(R.drawable.cover_abs_2);



        }
        if (key.contains("abs") && key.contains("ad")) {
            imgWork.setImageResource(R.drawable.cover_abs_3);

        }





        if (key.contains("arm") && key.contains("bg")) {
            imgWork.setImageResource(R.drawable.cover_arm_1);

        }
        if (key.contains("arm") && key.contains("im")) {

            imgWork.setImageResource(R.drawable.cover_arm_2);

        }
        if (key.contains("arm") && key.contains("ad")) {


            imgWork.setImageResource(R.drawable.cover_arm_3);
        }







        if (key.contains("leg") && key.contains("bg")) {
            imgWork.setImageResource(R.drawable.cover_leg_1);

        }
        if (key.contains("leg") && key.contains("im")) {

            imgWork.setImageResource(R.drawable.cover_leg_2);

        }
        if (key.contains("leg") && key.contains("ad")) {

            imgWork.setImageResource(R.drawable.cover_leg_3);

        }





    }

}