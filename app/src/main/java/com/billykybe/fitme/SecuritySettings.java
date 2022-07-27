package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.biometric.BiometricManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class SecuritySettings extends AppCompatActivity {
ImageView backAct;
Switch securityLock ,InstantLock;


TextView changePinBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security_settings);

initViews();

        changePinBtn.setOnClickListener(view -> {
       Intent intent = new Intent(getApplicationContext(),ChangePin.class);
       startActivity(intent);
        });

//        Shared prefs the switch

        //working





    }








    private void initViews() {
        changePinBtn = findViewById(R.id.changePinBtn);
backAct = findViewById(R.id.ss_backBtn);
    }
}