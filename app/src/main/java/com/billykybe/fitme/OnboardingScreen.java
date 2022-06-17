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

        // fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);



//        btn_prev.setVisibility(View.INVISIBLE);

        // dots indicators
//        setUpIndicators(0);

        pagerAdapter = new PagerAdapter(this.getApplicationContext(), images, titles);

        slider.setAdapter(pagerAdapter);

        btn_next.setOnClickListener(View ->{
            if(getItem(0) < 2){
                slider.setCurrentItem(getItem(1), true);
            }else{
                startActivity(new Intent(OnboardingScreen.this, HomePage.class));
                finish();
            }
        });
//        btn_prev.setOnClickListener(View ->{
//            if(getItem(0) > 0){
//                slider.setCurrentItem(getItem(-1), true);
//            }
//        });

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

//    @SuppressLint("NewApi")
//    private void setUpIndicators(int position) {
//        dots = new TextView[3];
//        ll_dots.removeAllViews();
//
//        for (int i = 0; i < dots.length; i++) {
//            dots[i] = new TextView(this);
//            dots[i].setText(Html.fromHtml("&#8226"));
//            dots[i].setTextSize(35);
//            dots[i].setTextColor(getResources().getColor(R.color.color_text_primary,
//                    getApplicationContext().getTheme()));
//            ll_dots.addView(dots[i]);
//        }
//        dots[position].setTextColor(getColor(R.color.color_secondary));
//        //dots[position].setTextSize(50);
//    }

    int getItem(int i){
        return slider.getCurrentItem() + i;
    }
}