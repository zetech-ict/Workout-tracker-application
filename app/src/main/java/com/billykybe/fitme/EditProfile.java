package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EditProfile extends AppCompatActivity {
TextView ep_continue ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        ep_continue = findViewById(R.id.ep_continue);
        ep_continue.setOnClickListener(view -> {

            //TODO:save validation
            finish();
        });
    }
}