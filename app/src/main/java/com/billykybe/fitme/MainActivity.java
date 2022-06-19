package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

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

        afterHandler = 3;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (afterHandler == 1){
                    Intent toHomePage = new Intent(getApplicationContext(),HomePage.class);
                    startActivity(toHomePage);
                    finish();


                }else if (afterHandler == 2){
//                    Intent toSecurityCheck = new Intent(getApplicationContext(),);
//                    TODO://           startActivity(toSecurityCheck);

                }else if (afterHandler == 3){
                    Intent toOnboardingLauncher = new Intent(getApplicationContext(),WelcomeScreen.class);
startActivity(toOnboardingLauncher);
                    finish();


                }


            }
        },1500);

    }
}