package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DataCollection extends AppCompatActivity {
    int age = 25;
    TextView ageHolder;
    int weight = 55;
    TextView weightHolder;
    int height = 300;
    TextView heightHolder;
    boolean isMale = true;
    int goal,activityLevel;
    View one,two,three,four,five;
    List<Boolean> isPicked = new ArrayList<>();
    ImageView addAge ,minusAge;
    ImageView addweight ,minusweight;
    ImageView addheight ,minusheight;
    TextView levelBg,levelIm,levelAd;
    TextView gBuildMuscles,gImprove,gLoseWeight,gGainWeight,gGetFitter;

int COLLECTION_SCREEN = 1;
TextView mainHeading,mainDescription,nexBtn,prevBtnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection);


        ///



        ///
        // Age picker
//        agePicker();

        goalsPicker();

        ///

         initViews();
        updateView(COLLECTION_SCREEN);

//Onclicks
        nexBtn.setOnClickListener(view -> {
            if (COLLECTION_SCREEN < 5){
                COLLECTION_SCREEN++;
updateView(COLLECTION_SCREEN);
            }
            else {
                COLLECTION_SCREEN = 5;
                Intent intent = new Intent(getApplicationContext(),HomePage.class);

                intent.putExtra("age",age);
                intent.putExtra("weight",weight);
                intent.putExtra("height",height);
                intent.putExtra("isMale",isMale);
                intent.putExtra("goal",goal);
                intent.putExtra("activityLevel",activityLevel);

//                createUser(age,weight,height,isMale,goal,activityLevel);
                startActivity(intent);
            }
        });


        //Age collection

        addAge = findViewById(R.id.increment_age);
        minusAge = findViewById(R.id.decrement_age);
ageHolder = findViewById(R.id.age_holder_txt);
        addAge.setOnClickListener(view -> {
         age++;
         ageHolder.setText(String.valueOf(age));

        });
        minusAge.setOnClickListener(view ->{
            if (age>16)age--;

            ageHolder.setText(String.valueOf(age));

        } );



        // weight collection

        minusweight = findViewById(R.id.decrement_weight);
        addweight = findViewById(R.id.increment_weight);
       weightHolder  = findViewById(R.id.weight_holder_txt);
        addweight.setOnClickListener(view -> {
            weight++;
            weightHolder.setText(String.valueOf((int) weight));

        });
        minusweight.setOnClickListener(view ->{

            if (weight>0)weight--;

            weightHolder.setText(String.valueOf((int) weight));

        } );


        minusheight = findViewById(R.id.decrement_height);
        addheight = findViewById(R.id.increment_height);
        heightHolder  = findViewById(R.id.height_holder_txt);
        addheight.setOnClickListener(view -> {

            if (height<500)height++;

            heightHolder.setText(String.valueOf((int) height));

        });
        minusheight.setOnClickListener(view ->{
            if (height>0)height--;


            heightHolder.setText(String.valueOf((int) height));

        } );




        levelBg.setOnClickListener(view -> {
//            Change views bg and txt hackish
activityLevel = 1;
            levelBg.setTextColor(Color.WHITE);
            levelIm.setTextColor(Color.BLACK);
            levelAd.setTextColor(Color.BLACK);

            levelBg.setBackgroundResource(R.drawable.level_holder_selected);
            levelIm.setBackgroundResource(R.drawable.level_holder);
            levelAd.setBackgroundResource(R.drawable.level_holder);

        });
        levelIm.setOnClickListener(view -> {
            activityLevel = 2;

            levelIm.setTextColor(Color.WHITE);
            levelBg.setTextColor(Color.BLACK);
            levelAd.setTextColor(Color.BLACK);
            levelIm.setBackgroundResource(R.drawable.level_holder_selected);
            levelBg.setBackgroundResource(R.drawable.level_holder);
            levelAd.setBackgroundResource(R.drawable.level_holder);
        });
        levelAd.setOnClickListener(view -> {
            activityLevel =3;

            levelAd.setTextColor(Color.WHITE);
            levelIm.setTextColor(Color.BLACK);
            levelBg.setTextColor(Color.BLACK);

            levelAd.setBackgroundResource(R.drawable.level_holder_selected);
            levelBg.setBackgroundResource(R.drawable.level_holder);
            levelIm.setBackgroundResource(R.drawable.level_holder);
        });
        prevBtnt.setOnClickListener(view -> {
            if (COLLECTION_SCREEN > 1){
COLLECTION_SCREEN--;
updateView(COLLECTION_SCREEN);

            }else {

                finish();
            }

        });

    }
//
//    private void createUser(int age, int weight, int height, boolean isMale, int goal, int activityLevel) {
//        FitMeDatabase db = FitMeDatabase.getInstance(this.getApplicationContext());
//        UserAccount user = new UserAccount();
//        user.setId(1);
//        user.setAge(age);
//        user.setWheight(weight);
//        user.setHeight(height);
//        user.setMale(isMale);
//
//        user.setLevelOfWorkout(activityLevel);
//        db.userDao().insertUser(user);
//        finish();
//    }

    private void goalsPicker() {
        //hackish to change

        gGetFitter = findViewById(R.id.goal_getfitter);//1
        gImprove = findViewById(R.id.goal_endurance);//2
        gBuildMuscles = findViewById(R.id.goal_buildmuscles);//3
        gGainWeight = findViewById(R.id.goal_gainweight);//4
        gLoseWeight = findViewById(R.id.goal_loseweight);//0
        isPicked.add(false);
        isPicked.add(false);
        isPicked.add(false);
        isPicked.add(false);
        isPicked.add(false);

        gGetFitter.setOnClickListener(view -> {
         if (isPicked.get(1)){
             isPicked.set(1,false);
             gGetFitter.setBackgroundResource(R.drawable.level_holder);
             gGetFitter.setTextColor(Color.BLACK);

         }else {
             isPicked.set(1,true);
             gGetFitter.setBackgroundResource(R.drawable.level_holder_selected);
             gGetFitter.setTextColor(Color.WHITE);


         }
        });

        gImprove.setOnClickListener(view -> {
            if (isPicked.get(2)){
                isPicked.set(2,false);
                gImprove.setBackgroundResource(R.drawable.level_holder);
                gImprove.setTextColor(Color.BLACK);
            }else {
                isPicked.set(2,true);
                gImprove.setBackgroundResource(R.drawable.level_holder_selected);
                gImprove.setTextColor(Color.WHITE);

            }
        });

        gBuildMuscles.setOnClickListener(view -> {
            if (isPicked.get(3)){
                isPicked.set(3,false);
                gBuildMuscles.setBackgroundResource(R.drawable.level_holder);
                gBuildMuscles.setTextColor(Color.BLACK);

            }else {
                isPicked.set(3,true);
                gBuildMuscles.setBackgroundResource(R.drawable.level_holder_selected);
                gBuildMuscles.setTextColor(Color.WHITE);

            }
        });

        gGainWeight.setOnClickListener(view -> {
            if (isPicked.get(4)){
                isPicked.set(4,false);
                gGainWeight.setTextColor(Color.BLACK);

                gGainWeight.setBackgroundResource(R.drawable.level_holder);
            }else {
                isPicked.set(4,true);
                gGainWeight.setTextColor(Color.WHITE);

                gGainWeight.setBackgroundResource(R.drawable.level_holder_selected);

            }
        });

        gLoseWeight.setOnClickListener(view -> {
            if (isPicked.get(0)){
                isPicked.set(0,false);
                gLoseWeight.setTextColor(Color.BLACK);

                gLoseWeight.setBackgroundResource(R.drawable.level_holder);
            }else {
                isPicked.set(0,true);
                gLoseWeight.setTextColor(Color.WHITE);

                gLoseWeight.setBackgroundResource(R.drawable.level_holder_selected);

            }
        });



    }

//    private void agePicker() {
//        int firstItemHeightDate,paddingDate,itemHeightDate,allPxDate,finalHeightDate;
//
//        final RecyclerView recyclerView = findViewById(R.id.rv_agePick);
//        if (recyclerView != null){
//        recyclerView.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                setAgeValue();
//            }
//        },300)    ;
//        }
//
//        ViewTreeObserver viewTreeObserver = recyclerView.getViewTreeObserver();
//        viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
//            @Override
//            public boolean onPreDraw() {
//                recyclerView.getViewTreeObserver().removeOnPreDrawListener(this);
//
//
//                return false;
//            }
//        });
//
// TODO: Update to this age wheight height picker
//    }

    private void setAgeValue() {
    }


    private void updateView(int toShow) {
        switch (toShow){





            case 1:
                mainHeading.setText("How Old Are You?");
                mainDescription.setText(R.string.agess);
                one.setVisibility(View.VISIBLE);
                two.setVisibility(View.INVISIBLE);
                three.setVisibility(View.INVISIBLE);
                four.setVisibility(View.INVISIBLE);
                five.setVisibility(View.INVISIBLE);
                break;
            case 2:
                mainHeading.setText("What is Your Weight?");
                mainDescription.setText(R.string.wheightt);
                one.setVisibility(View.INVISIBLE);
                two.setVisibility(View.VISIBLE);
                three.setVisibility(View.INVISIBLE);
                four.setVisibility(View.INVISIBLE);
                five.setVisibility(View.INVISIBLE);
                break;
            case 3:
                mainHeading.setText("What is Your Height?");
                mainDescription.setText(R.string.height);
                one.setVisibility(View.INVISIBLE);
                two.setVisibility(View.INVISIBLE);
                three.setVisibility(View.VISIBLE);
                four.setVisibility(View.INVISIBLE);
                five.setVisibility(View.INVISIBLE);
                break;
            case 4:
                mainHeading.setText("What is Your Goal?");
                mainDescription.setText(R.string.goals);
                one.setVisibility(View.INVISIBLE);
                two.setVisibility(View.INVISIBLE);
                three.setVisibility(View.INVISIBLE);
                four.setVisibility(View.INVISIBLE);
                five.setVisibility(View.VISIBLE);
                break;
            case 5:
                mainHeading.setText("Physical Activity Level?");
                mainDescription.setText(R.string.physical);
                one.setVisibility(View.INVISIBLE);
                two.setVisibility(View.INVISIBLE);
                three.setVisibility(View.INVISIBLE);
                four.setVisibility(View.VISIBLE);
                five.setVisibility(View.INVISIBLE);
                break;

            default:
                mainHeading.setText("Code Red");
                        mainDescription.setText("Red Code");
                one.setVisibility(View.INVISIBLE);
                two.setVisibility(View.INVISIBLE);
                three.setVisibility(View.INVISIBLE);
                four.setVisibility(View.INVISIBLE);
                five.setVisibility(View.INVISIBLE);
                break;
        }

    }


    private void initViews() {
        mainHeading = findViewById(R.id.dc_heading_txt);
        mainDescription = findViewById(R.id.dc_desc_txt);
        nexBtn = findViewById(R.id.continueBtn);
        prevBtnt = findViewById(R.id.backBtn);
        levelBg = findViewById(R.id.level_begginer);
        levelIm = findViewById(R.id.level_intermediate);
        levelAd = findViewById(R.id.level_advanced);
        one = findViewById(R.id.ageCollection);
        two = findViewById(R.id.wheightCollection);
        three = findViewById(R.id.heightCollection);
        four= findViewById(R.id.levelCollection);
        five= findViewById(R.id.goals_pick);

    }
}