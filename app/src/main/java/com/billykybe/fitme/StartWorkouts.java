package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

public class StartWorkouts extends AppCompatActivity {
    ProgressBar progressBar ;
    TextView counter ,skipcount;

    int modifier=15;
    int startCount = 0;
    int temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_workouts);


        String id = getIntent().getStringExtra("id");


        skipcount= findViewById(R.id.fi_continue);

        progressBar = findViewById(R.id.gr_progressbar);
        progressBar.setMax(15);
counter = findViewById(R.id.counter_text);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                if (startCount < modifier){
                    temp = modifier -  startCount;
counter.setText(""+temp); //fall


                    startCount ++;

progressBar.setProgress(startCount); //rise
handler.postDelayed(this,0);
                }else {

                    Intent intent = new Intent(getApplicationContext(),WorkoutScreen.class);
                  intent.putExtra("id",id);
                    startActivity(intent);
                    finish();
                }

            }
        },15000);
        skipcount.setOnClickListener(view -> {
handler.removeCallbacksAndMessages(null);
            Intent intentTo = new Intent(getApplicationContext(),WorkoutScreen.class);
            intentTo.putExtra("id",id);
            startActivity(intentTo);
            finish();
        });
    }
}