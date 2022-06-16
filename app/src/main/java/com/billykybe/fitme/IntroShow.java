package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class IntroShow extends AppCompatActivity {

    ViewPager viewPager ;
    FiViewPagerAdapter fiViewPagerAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_show);
        viewPager = findViewById(R.id.viewPager_holder);
fiViewPagerAdapter = new FiViewPagerAdapter(getSupportFragmentManager());
viewPager.setAdapter(fiViewPagerAdapter);


    }
}