package com.billykybe.fitme;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EndOfWorkout extends AppCompatActivity {
    TextView toHome, toReminder;
    String workouts, calories;
    String timeMin;
    String timeSec;
String time;
TextView congrats_workouts,congrats_calos,congrats_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_of_workout);
        Intent intent = getIntent();
        workouts = intent.getStringExtra("workouts");
        calories = intent.getStringExtra("calos");
        timeMin = intent.getStringExtra("mins");
        timeSec = intent.getStringExtra("secs");
time = timeMin+":"+timeSec;

//init
        congrats_workouts = findViewById(R.id.congrats_workouts);
        congrats_calos = findViewById(R.id.congrats_calories);
        congrats_time = findViewById(R.id.congrats_minutes);

        congrats_workouts.setText(workouts);
        congrats_calos.setText(calories);
        congrats_time.setText(time);




        toHome = findViewById(R.id.eow_toHome);
        toHome.setOnClickListener(view -> {
            Intent toHome = new Intent(getApplicationContext(), HomePage.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(toHome);

            finish();
        });
        toReminder = findViewById(R.id.eow_toTimer);
        toReminder.setOnClickListener(view -> {
            Intent toReminder = new Intent(getApplicationContext(), Reminder.class);
            startActivity(toReminder);
finish();
        });
    }
}

