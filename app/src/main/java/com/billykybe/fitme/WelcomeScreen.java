package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        //todo: add timeout then to onboarding
    }
}