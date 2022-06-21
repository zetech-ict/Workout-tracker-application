package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class NottificationSettings extends AppCompatActivity {
ImageView notIf_backBtn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nottification_settings);

        notIf_backBtn = findViewById(R.id.notIf_backBtn);
        notIf_backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}