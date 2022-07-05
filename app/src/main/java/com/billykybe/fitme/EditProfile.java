package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class EditProfile extends AppCompatActivity {
TextView ep_continue ;
boolean isMale = false;
View maleEdit,femaleEdit;
ImageView             addagedit,minusgedit;
TextView ageTv,emailTv,nameTv,editAge,ageHolder;
int currentAge;
TextView ep_gender_edit;
View editHolder,clickBack,genderPick,agePick
        ;
    String name ,date,gender,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        ageHolder = findViewById(R.id.ep_dob_edit);
        genderPick = findViewById(R.id.genderEdit);
        agePick = findViewById(R.id.ageedditor);
        ep_gender_edit = findViewById(R.id.ep_gender_edit);
        ep_gender_edit.setOnClickListener(view -> {
            clickBack.setVisibility(View.VISIBLE);
agePick.setVisibility(View.GONE);
            editHolder.setVisibility(View.VISIBLE);

            genderPick.setVisibility(View.VISIBLE);
        });
        editHolder = findViewById(R.id.editHolder);
        clickBack = findViewById(R.id.clickBack);
        clickBack.setOnClickListener(view -> {
            ageHolder.setText(String.valueOf(currentAge));
            editHolder.setVisibility(View.GONE);
            clickBack.setVisibility(View.GONE);
genderPick.setVisibility(View.GONE);


            agePick.setVisibility(View.GONE);

        });
        ageHolder.setOnClickListener(view -> {
            clickBack.setVisibility(View.VISIBLE);
agePick.setVisibility(View.VISIBLE);
genderPick.setVisibility(View.GONE);
            editHolder.setVisibility(View.VISIBLE);

        });
        currentAge = Integer.parseInt(ageHolder.getText().toString());

        getData();

        ep_continue = findViewById(R.id.ep_continue);
        ep_continue.setOnClickListener(view -> {

            //TODO:save validation
            finish();
        });
        editAge = findViewById(R.id.ageedit);
        editAge.setText(String.valueOf(currentAge));

        maleEdit = findViewById(R.id.edit_male_holder);
        femaleEdit = findViewById(R.id.edit_female_holder);
        maleEdit.setOnClickListener(view -> {
            isMale = true;
            ep_gender_edit.setText("Male");
            maleEdit.setBackgroundResource(R.drawable.gender_selected_bg);
            femaleEdit.setBackgroundResource(R.drawable.genderselectorholder_bg);

        });
        femaleEdit.setOnClickListener(view -> {
            isMale = false;
            ep_gender_edit.setText("Female");

            maleEdit.setBackgroundResource(R.drawable.genderselectorholder_bg);
            femaleEdit.setBackgroundResource(R.drawable.gender_selected_bg);

        });

        minusgedit = findViewById(R.id.minusagedit);
        addagedit = findViewById(R.id.addagedit);
        addagedit.setOnClickListener(view -> {
            currentAge++;            ageHolder.setText(String.valueOf(currentAge));

            editAge.setText(String.valueOf(currentAge));


        });

        minusgedit.setOnClickListener(view -> {
            currentAge--;               ageHolder.setText(String.valueOf(currentAge));

            editAge.setText(String.valueOf(currentAge));


        });
    }


    private void getData() {

    }
}