package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RestWorkout extends AppCompatActivity {
    TextView counter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest_workout);



        Bundle intent = getIntent().getExtras();

        String id = intent.getString("nextWorkout");

    counter.setText(id);
    }
}