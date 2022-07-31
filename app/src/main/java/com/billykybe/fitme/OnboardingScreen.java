package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
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
    int[] images = {R.drawable.wsetimg_plan_addtools_v0, R.drawable.intro2, R.drawable.intro3};
    String[] titles = {"Find suitable workouts and genuine results with no equipments", "Find Find the right workout for what you need", "Let's do a workout and live healthy with us"};

    Button btn_prev, btn_next;
    TextView fi_continue ,fi_text;
    View view1,view2,view3;
    ImageView mainImage;
//todo://fix

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_screen);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        fi_continue = findViewById(R.id.fi_continue);
        fi_text = findViewById(R.id.fi_text);
        view1 = findViewById(R.id.fi_dashOne);
        view2 = findViewById(R.id.fi_dashTwo);
        view3 = findViewById(R.id.fi_dashThree);
        mainImage =findViewById(R.id.mainimg);

        fi_continue.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(),DataCollection.class);
            startActivity(intent);
            finish();
        });
        // fullscreen


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
//if (position==0){
//    view1.setBackgroundResource(R.drawable.dashselected_bg);
//    view2.setBackgroundResource(R.drawable.dash_null);
//
//    view3.setBackgroundResource(R.drawable.dash_null);
//}else if (position==1){
//    view1.setBackgroundResource(R.drawable.dash_null);
//    view2.setBackgroundResource(R.drawable.dashselected_bg);
//    view3.setBackgroundResource(R.drawable.dash_null);
//
//}else if (position==2){
//    view1.setBackgroundResource(R.drawable.dash_null);
//    view2.setBackgroundResource(R.drawable.dash_null);
//    view3.setBackgroundResource(R.drawable.dashselected_bg);
//
//}TODO: Fix this
//                Toast.makeText(OnboardingScreen.this, String.valueOf(position), Toast.LENGTH_SHORT).show();


            }

//

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    int getItem(int i){
        return slider.getCurrentItem() + i;
    }
}