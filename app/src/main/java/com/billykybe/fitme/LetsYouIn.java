package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LetsYouIn extends AppCompatActivity {
    TextView signin;
    TextView signup ;
View facebook,google,apple;
//


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lets_you_in);
         facebook = findViewById(R.id.facebook_signup_holder);
         google = findViewById(R.id.ca_google_signup_holder);
         apple = findViewById(R.id.ca_apple_signup_holder);

        signin  = findViewById(R.id.lyi_continue);
        signup  = findViewById(R.id.signup_txt);


        signin.setOnClickListener(view -> {
            Intent intent = new Intent(this.getApplicationContext(),LoginAccount.class);
            startActivity(intent);

        });


        signup.setOnClickListener(view -> {

            Intent intent = new Intent(getApplicationContext(),CreateAccount.class);
            startActivity(intent);

        });
    }
}