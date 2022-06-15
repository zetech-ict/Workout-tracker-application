package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        //todo: add timeout then to onboarding

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

               //todo://  Intent toOnboarding = new Intent(getApplicationContext(),);
            }
        },1500);
    }
}