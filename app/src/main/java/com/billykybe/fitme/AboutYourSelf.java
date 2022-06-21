package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.billykybe.fitme.R;

public class AboutYourSelf extends AppCompatActivity {

    View male,female;
    TextView picGender;
    boolean isMale = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_your_self);


        male = findViewById(R.id.ays_male_holder);
        female = findViewById(R.id.ays_female_holder);
        picGender = findViewById(R.id.ays_continue);
        male.setOnClickListener(view -> {
            isMale = true;
            male.setBackgroundResource(R.drawable.gender_selected_bg);
            female.setBackgroundResource(R.drawable.genderselectorholder_bg);

        });
        female.setOnClickListener(view -> {
            isMale = false;
            male.setBackgroundResource(R.drawable.genderselectorholder_bg);
            female.setBackgroundResource(R.drawable.gender_selected_bg);

        });

        picGender.setOnClickListener(view -> {

            Intent intent = new Intent(getApplicationContext(),DataCollection.class);
            intent.putExtra("isMale",isMale);

            startActivity(intent);
            finish();
        });




    }
}