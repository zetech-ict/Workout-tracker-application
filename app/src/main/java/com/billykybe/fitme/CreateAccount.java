package com.billykybe.fitme;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CreateAccount extends AppCompatActivity {


    ImageView eye;
    TextView rememberMe;
    CheckBox remMe;
    ImageView backBtn;
    ImageView rememberCheck;
    TextView signUp, signin;

    //    Inputs
    EditText ca_email, ca_password;
    TextView emailErr, passErr;
    boolean eyeOn = false;
    boolean rememberMeToggle = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        initviews();

        rememberMe.setOnClickListener(view -> {

            if (rememberMeToggle) {
                rememberMeToggle = false;
                remMe.setChecked(false);

            } else {
                rememberMeToggle = true;
                remMe.setChecked(true);
            }


        });
        remMe.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean check) {
                rememberMeToggle = check;
            }
        });
backBtn.setOnClickListener(view -> {
    finish();
});
        eye.setOnClickListener(view -> {


            if (eyeOn) {
                eye.setImageResource(R.drawable.design_ic_visibility_off);
                eyeOn = false;
                ca_password.setTransformationMethod(new PasswordTransformationMethod());


            } else {
                eye.setImageResource(R.drawable.design_ic_visibility);
                eyeOn = true;
                ca_password.setTransformationMethod(null);
            }


        });
        signin.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), LoginAccount.class);
            startActivity(intent);
            finish();
        });


        signUp.setOnClickListener(view -> {

            String guestEmail = ca_email.getText().toString();
            String guestPassword = ca_password.getText().toString();


            if (guestEmail.equals("")) {
                emailErr.setText("Email required");
                emailErr.setVisibility(View.VISIBLE);
            } else {
                emailErr.setVisibility(View.INVISIBLE);

            }

            if (guestPassword.equals("")) {
                passErr.setText("Password required");
                passErr.setVisibility(View.VISIBLE);

            } else {
                passErr.setVisibility(View.INVISIBLE);
                if (guestPassword.length() <= 5) {
                    passErr.setText("Password to short");
                    passErr.setVisibility(View.VISIBLE);
                }
                else {
                    Intent intent = new Intent(getApplicationContext(), AboutYourSelf.class);
                    startActivity(intent);
                }
            }




        });
    }

    private void initviews() {
        rememberMe = findViewById(R.id.rememberMe_txt);
        signUp = findViewById(R.id.ca_continue);
        ca_email = findViewById(R.id.ca_email_edit);
        ca_password = findViewById(R.id.ca_password_edit);
        emailErr = findViewById(R.id.email_err);
        passErr = findViewById(R.id.password_err);
        eye = findViewById(R.id.ca_eye);
        remMe = findViewById(R.id.ca_remMe);
        backBtn = findViewById(R.id.ca_backBtn);
        signin = findViewById(R.id.signin_txt);
    }
}