package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class JourneyAct extends AppCompatActivity {
    TextView mj_textLnk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journey);

        mj_textLnk = findViewById(R.id.mj_textLnk);

        mj_textLnk.setOnClickListener(view1 -> {
            Intent toJourney = new Intent(getApplicationContext(),MyJourney.class);
            startActivity(toJourney);
        });
    }
}