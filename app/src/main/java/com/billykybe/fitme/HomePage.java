package com.billykybe.fitme;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomePage extends AppCompatActivity {
TextView greatings;
BottomNavigationView bottomNavigationView ;
    ImageView homeBtn,accountBtn,historyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        homeBtn = findViewById(R.id.home_btn);
        accountBtn = findViewById(R.id.account_btn);
        historyBtn = findViewById(R.id.stats_btn);
bottomNavigationView = findViewById(R.id.bottomnav);
bottomNavigationView.setOnNavigationItemSelectedListener(navListener);


        int activePage = 0; // todo : // for tint change on btn



    }
    long pressedtime;

    @Override
    public void onBackPressed() {
        if (pressedtime +2000>System.currentTimeMillis()){
            super.onBackPressed();
            finish();

        }else {
            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        pressedtime=System.currentTimeMillis();
    }
    private  BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
         Fragment selectedFragment = new HomeFragment();
         switch (item.getItemId()){
             case R.id.nav_account:
                 selectedFragment = new MyProfile();
                 break;

             case R.id.nav_home:
                 selectedFragment = new HomeFragment();

                 break;

             case R.id.nav_insights:
                 selectedFragment = new HistoryFragment();

                 break;
             case R.id.nav_journey:
                 selectedFragment = new Journey();

                 break;
         }



              getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,selectedFragment).commit();
return true;
        }
    };
}