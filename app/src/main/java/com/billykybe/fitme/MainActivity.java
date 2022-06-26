package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

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

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        afterHandler = 3;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (afterHandler == 1){
                    Intent toHomePage = new Intent(getApplicationContext(),HomePage.class);
                    startActivity(toHomePage);
                    finish();


                }else if (afterHandler == 2){
                    Intent toSecurityCheck = new Intent(getApplicationContext(),SecurityCheck.class);
                    startActivity(toSecurityCheck);
finish();
                }else if (afterHandler == 3){
                    Intent toOnboardingLauncher = new Intent(getApplicationContext(),WelcomeScreen.class);
startActivity(toOnboardingLauncher);
                    finish();


                }


            }
        },1500);

    }
}