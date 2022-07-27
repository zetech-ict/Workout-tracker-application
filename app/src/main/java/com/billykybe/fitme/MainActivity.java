package com.billykybe.fitme;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int afterHandler;
    /*
     * 1 = to home screen
     * 2 = to security check
     * 3 = to onBoarding
     * */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        afterHandler = 3;
        SharedPreferences sharedPreferences = getSharedPreferences("Handle Splash", Context.MODE_PRIVATE);
        int afterHanldeNo = sharedPreferences.getInt("afterHandlerValue", afterHandler);
        afterHandler = afterHanldeNo;


//        afterHandler = Integer.parseInt(getIntent().getStringExtra("toOnboard"));


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (afterHandler == 1) {
                    Intent toHomePage = new Intent(getApplicationContext(), HomePage.class);
                    updateHandler();
                    startActivity(toHomePage);
                    finish();


                } else if (afterHandler == 2) {
                    Intent toSecurityCheck = new Intent(getApplicationContext(), SecurityCheck.class);
                    updateHandler();

                    startActivity(toSecurityCheck);
                    finish();
                } else if (afterHandler == 3) {
                    Intent toOnboardingLauncher = new Intent(getApplicationContext(), WelcomeScreen.class);
                    updateHandler();

                    startActivity(toOnboardingLauncher);
                    finish();


                }


            }
        }, 1500);

    }

    private void updateHandler() {

        if (afterHandler == 1) {

            //keep homing

        } else if (afterHandler == 2) {
            //keep secure

        } else {
            afterHandler = 1;
            SharedPreferences sharedPreferences = getSharedPreferences("Handle Splash", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putInt("afterHandlerValue", afterHandler);
            editor.apply();

        }
    }
}