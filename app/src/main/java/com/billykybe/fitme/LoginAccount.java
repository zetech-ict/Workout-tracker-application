package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginAccount extends AppCompatActivity {
    TextView signIn ,rememberMe,forgetPass,signupTxt;
    ImageView eye,loginApple,loginGoogle,loginFaceBook,backBtn,rememberCheck;
    EditText laEmail,laPassword;

    String cEmail = "billykybe@gmail.com";
    String cPassword = "123456";
    //change email icon and pass
CheckBox remmecheck ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_account);
initViews();
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


         laEmail = findViewById(R.id.la_email_edit);
         laPassword = findViewById(R.id.la_password_edit);

    }


}