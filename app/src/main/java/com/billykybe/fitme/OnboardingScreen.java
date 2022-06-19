package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class OnboardingScreen extends AppCompatActivity {

    ViewPager slider ;
    PagerAdapter pagerAdapter;
    int[] images = {R.drawable.intro1, R.drawable.intro2, R.drawable.intro3};
    String[] titles = {"Find suitable workouts and genuine results", "Find Find the right workout for what you need", "Let's do a workout and live healthy with us"};

    Button btn_prev, btn_next;
    TextView fi_continue ,fi_text;
    View view1,view2,view3;
    ImageView mainImage;
//todo://fix

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_screen);


        fi_continue = findViewById(R.id.fi_continue);
        fi_text = findViewById(R.id.fi_text);
        view1 = findViewById(R.id.fi_dashOne);
        view2 = findViewById(R.id.fi_dashTwo);
        view3 = findViewById(R.id.fi_dashThree);
        mainImage =findViewById(R.id.mainimg);

        fi_continue.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(),LetsYouIn.class);
            startActivity(intent);
            finish();
        });
        // fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);



//        btn_prev.setVisibility(View.INVISIBLE);

        // dots indicators
//        setUpIndicators(0);

        pagerAdapter = new PagerAdapter(this.getApplicationContext(), images, titles);
slider = findViewById(R.id.viewpager_slider);
        slider.setAdapter(pagerAdapter);




        slider.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {



            }

//

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }



    int getItem(int i){
        return slider.getCurrentItem() + i;
    }
}