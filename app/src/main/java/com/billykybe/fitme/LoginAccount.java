package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginAccount extends AppCompatActivity {


    TextView signIn = findViewById(R.id.la_continue);
    TextView rememberMe = findViewById(R.id.la_rememberMe_txt);
    ImageView eye = findViewById(R.id.la_eye);
    TextView forgetPass = findViewById(R.id.lg_fp);
    ImageView loginFaceBook = findViewById(R.id.lg_fb);
    ImageView loginGoogle = findViewById(R.id.lg_gg);
    ImageView loginApple = findViewById(R.id.lg_ap);
    TextView signupTxt = findViewById(R.id.signup_txt);
    ImageView backBtn = findViewById(R.id.la_backBtn);

    ImageView rememberCheck = findViewById(R.id.remTick);


    EditText laEmail = findViewById(R.id.la_email_edit);
    EditText laPassword = findViewById(R.id.la_password_edit);

    String cEmail = "billykybe@gmail.com";
    String cPassword = "123456";
    //change email icon and pass


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_account);

        signIn.setOnClickListener(view -> {
            //check email -> check pass -> check remember -> verify -> go to home

            String emailEntered = laEmail.getText().toString();
            String passwordEntered = laPassword.getText().toString();

            if (emailEntered.equals("")){

            } else
            if (passwordEntered.equals("")){

            } else
            {
                //todo:// logins
                Intent toHomePage = new Intent(getApplicationContext(),HomePage.class);
                startActivity(toHomePage);
            }


        });




        rememberMe.setOnClickListener(view -> {



            if (rememberCheck.getVisibility()==View.INVISIBLE){

                //save login data
                rememberCheck.setVisibility(View.VISIBLE);


            }else {

                //dont save data
                rememberCheck.setVisibility(View.INVISIBLE);
            }

        });


        eye.setOnClickListener(view -> {

            if (eye.getResources().equals(R.drawable.design_ic_visibility_off)){
                eye.setImageResource(R.drawable.design_ic_visibility);
            }else {
                eye.setImageResource(R.drawable.design_ic_visibility_off);

            }

        });


        forgetPass.setOnClickListener(view -> {
            Intent toPassHelp = new Intent(getApplicationContext(),ForgotPassword.class);
            startActivity(toPassHelp);

        });


        loginFaceBook.setOnClickListener(view -> {});
        loginGoogle.setOnClickListener(view -> {});
        loginApple.setOnClickListener(view -> {});


        signupTxt.setOnClickListener(view -> {
            Intent toPassHelp = new Intent(getApplicationContext(),CreateAccount.class);
            startActivity(toPassHelp);
        });
        backBtn.setOnClickListener(view -> {
            //todo:// backbtn
        });
    }


}