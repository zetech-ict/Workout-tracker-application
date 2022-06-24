package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginAccount extends AppCompatActivity {
    TextView signIn ,rememberMe,forgetPass,signupTxt;
    ImageView eye,loginApple,loginGoogle,loginFaceBook,backBtn,rememberCheck;
    EditText laEmail,laPassword;
    TextView emaiErr ,passErr;
    boolean eyeOnn = false;
    boolean rememberMeTogglee = false;


    //
CheckBox remmecheck ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_account);
initViews();

        rememberMe.setOnClickListener(view -> {

            if (rememberMeTogglee) {
                rememberMeTogglee = false;
                remmecheck.setChecked(false);

            } else {
                rememberMeTogglee = true;
                remmecheck.setChecked(true);
            }


        });
        eye.setOnClickListener(view -> {


            if (eyeOnn) {
                eye.setImageResource(R.drawable.design_ic_visibility_off);
                eyeOnn = false;
                laPassword.setTransformationMethod(new PasswordTransformationMethod());


            } else {
                eye.setImageResource(R.drawable.design_ic_visibility);
                eyeOnn = true;
                laPassword.setTransformationMethod(null);
            }


        });
        signIn.setOnClickListener(view -> {
            //check email -> check pass -> check remember -> verify -> go to home








            /////
            String emailEntered = laEmail.getText().toString();
            String passwordEntered = laPassword.getText().toString();

            if (emailEntered.equals("")) {
                emaiErr.setText("Email required");
                emaiErr.setVisibility(View.VISIBLE);
            } else {
                emaiErr.setVisibility(View.INVISIBLE);

            }

            if (passwordEntered.equals("")) {
                passErr.setText("Password required");
                passErr.setVisibility(View.VISIBLE);

            } else {
                passErr.setVisibility(View.INVISIBLE);
                if (passwordEntered.length() <= 5) {
                    passErr.setText("Password to short");
                    passErr.setVisibility(View.VISIBLE);
                }
                else {
                    //TODO:// logins
                    Intent toHomePage = new Intent(getApplicationContext(),HomePage.class);
                    startActivity(toHomePage);
                }
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
            finish();
        });

    }

    private void initViews() {


       signIn = findViewById(R.id.la_continue); //todo:fix

        rememberMe = findViewById(R.id.la_rememberMe_txt);
         eye = findViewById(R.id.la_eye);
      forgetPass = findViewById(R.id.lg_fp);
      loginFaceBook = findViewById(R.id.lg_fb);
   loginGoogle = findViewById(R.id.lg_gg);
        loginApple = findViewById(R.id.lg_ap);
         signupTxt = findViewById(R.id.signup_txt);
         backBtn = findViewById(R.id.la_backBtn);

        remmecheck = findViewById(R.id.remmecheck);
        emaiErr = findViewById(R.id.la_email_err);
        passErr = findViewById(R.id.la_pass_err);

         laEmail = findViewById(R.id.la_email_edit);
         laPassword = findViewById(R.id.la_password_edit);

    }


}