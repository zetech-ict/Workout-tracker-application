package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MyJourney extends AppCompatActivity {
    ImageView mj_backBtn;
    TextView shareBtn,progtext,share_txt,infoTxt;
    String shareText ;
    List<MtData> mtData = new ArrayList<>();
    int openedSummit = 1;
    int currentWatchedItem = 0;
ImageView mt1,mt2,mt3,mt4,mt5,mt6,mt7,mt8,mt9,mt10,mt11,mt12,mt13,mt14,mt15,badge_img,fog1,fog2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_journey);

        initViews();
         initCurrentView();
        initText();

mj_backBtn.setOnClickListener(view -> {finish();});
initMt();
shareBtn.setOnClickListener(view -> {
    shareText = "I summited "+mtData.get(currentWatchedItem).getName()+
            " ("+mtData.get(currentWatchedItem).getHeight()+" m)  "+
//            mtData.get(currentWatchedItem).getDay()+" "+
//            mtData.get(currentWatchedItem).getMonth()+" "+
//            mtData.get(currentWatchedItem).getYear()+
            " Join me on my fitness journey with FitMe workouts";

    Intent intent = new Intent(Intent.ACTION_SEND);
    intent.setType("text/plain");
    intent.putExtra(Intent.EXTRA_SUBJECT,"FitMe App");
    intent.putExtra(Intent.EXTRA_TEXT,shareText);
    startActivity(Intent.createChooser(intent,"Share using"));
});


    }

    private void resetSelected() {
        initViews();
        mt1.setLayoutParams(new ConstraintLayout.LayoutParams(78,78));
        mt2.setLayoutParams(new ConstraintLayout.LayoutParams(78,78));
        mt3.setLayoutParams(new ConstraintLayout.LayoutParams(78,78));
        mt4.setLayoutParams(new ConstraintLayout.LayoutParams(78,78));
        mt5.setLayoutParams(new ConstraintLayout.LayoutParams(78,78));
        mt6.setLayoutParams(new ConstraintLayout.LayoutParams(78,78));
        mt7.setLayoutParams(new ConstraintLayout.LayoutParams(78,78));
        mt8.setLayoutParams(new ConstraintLayout.LayoutParams(78,78));
        mt9.setLayoutParams(new ConstraintLayout.LayoutParams(78,78));
        mt10.setLayoutParams(new ConstraintLayout.LayoutParams(78,78));
        mt11.setLayoutParams(new ConstraintLayout.LayoutParams(78,78));
        mt12.setLayoutParams(new ConstraintLayout.LayoutParams(78,78));
        mt13.setLayoutParams(new ConstraintLayout.LayoutParams(78,78));
        mt14.setLayoutParams(new ConstraintLayout.LayoutParams(78,78));
        mt15.setLayoutParams(new ConstraintLayout.LayoutParams(78,78));
    }

    private void initText() {
        DecimalFormat format = new DecimalFormat("00");
        String formatted = format.format(currentWatchedItem+1);
        String text = formatted+" of 15";
        progtext.setText(text);
    }
        private void initMt() {

        mtData.add(new MtData("Basecamp",R.drawable.achievement_basecamp,0,00,00,0000));
        mtData.add(new MtData("Kirkjufell",R.drawable.achievement_kirkjufell,463,00,00,0000));
        mtData.add(new MtData("El Capitan",R.drawable.achievement_el_capitan,2307,00,00,0000));
        mtData.add(new MtData("Mount Olympus",R.drawable.achievement_olympus,2918,00,00,0000));
        mtData.add(new MtData("Fitz Roy",R.drawable.achievement_fitz_roy,3359,00,00,0000));
        mtData.add(new MtData("Aoraki",R.drawable.achievement_aoraki,3724,00,00,0000));
        mtData.add(new MtData("Mount Fuji",R.drawable.achievement_fuji,3776,00,00,0000));
        mtData.add(new MtData("Matterhorn",R.drawable.achievement_matterhorn,4478,00,00,0000));
        mtData.add(new MtData("Mount Blanc",R.drawable.achievement_mont_blanc,4810,00,00,0000));
        mtData.add(new MtData("Popocatepetl",R.drawable.achievement_popocatepetl,5426,00,00,0000));
        mtData.add(new MtData("Kilimanjaro",R.drawable.achievement_kilimanjaro,5895,00,00,0000));
        mtData.add(new MtData("Denali",R.drawable.achievement_denali,6190,00,00,0000));
        mtData.add(new MtData("Annapurna",R.drawable.achievement_annapurna,8091,00,00,0000));
        mtData.add(new MtData("K2",R.drawable.achievement_k2,8611,00,00,0000));
        mtData.add(new MtData("Everest",R.drawable.achievement_everest,8843,00,00,0000));

    }

    private void initCurrentView() {
        mt1.setOnClickListener(view -> {

            currentWatchedItem = 0;
            initText();setShareBtn();

            badge_img.setImageResource(R.drawable.achievement_basecamp);

        });
        mt2.setOnClickListener(view -> {
            currentWatchedItem = 1;
            initText();setShareBtn();

            badge_img.setImageResource(R.drawable.achievement_kirkjufell);

        });
        mt3.setOnClickListener(view -> {
            currentWatchedItem = 2;
            initText();setShareBtn();

            badge_img.setImageResource(R.drawable.achievement_el_capitan);

        });
        mt4.setOnClickListener(view -> {
            currentWatchedItem = 3;
            initText();setShareBtn();

            badge_img.setImageResource(R.drawable.achievement_olympus);

        });
        mt5.setOnClickListener(view -> {
            currentWatchedItem = 4;
            initText();setShareBtn();

            badge_img.setImageResource(R.drawable.achievement_fitz_roy);

        });
        mt6.setOnClickListener(view -> {
            currentWatchedItem = 5;
            initText();setShareBtn();

            badge_img.setImageResource(R.drawable.achievement_aoraki);

        });
        mt7.setOnClickListener(view -> {
            currentWatchedItem = 6;
            initText();
            badge_img.setImageResource(R.drawable.achievement_fuji);

        });
        mt8.setOnClickListener(view -> {
            currentWatchedItem = 7;
            initText();setShareBtn();

            badge_img.setImageResource(R.drawable.achievement_matterhorn);

        });
        mt9.setOnClickListener(view -> {
            currentWatchedItem = 8;
            initText();setShareBtn();

            badge_img.setImageResource(R.drawable.achievement_mont_blanc);

        });
        mt10.setOnClickListener(view -> {
            currentWatchedItem = 9;
            initText();setShareBtn();

            badge_img.setImageResource(R.drawable.achievement_popocatepetl);

        });
        mt11.setOnClickListener(view -> {
            currentWatchedItem = 10;
            initText();setShareBtn();

            badge_img.setImageResource(R.drawable.achievement_kilimanjaro);

        });
        mt12.setOnClickListener(view -> {
            currentWatchedItem = 11;
            initText();setShareBtn();

            badge_img.setImageResource(R.drawable.achievement_denali);

        });
        mt13.setOnClickListener(view -> {
            currentWatchedItem = 12;
            initText();
            setShareBtn();

            badge_img.setImageResource(R.drawable.achievement_annapurna);

        });
        mt14.setOnClickListener(view -> {
            currentWatchedItem = 13;
            initText();
            setShareBtn();

            badge_img.setImageResource(R.drawable.achievement_k2);

        });
        mt15.setOnClickListener(view -> {
            currentWatchedItem = 14;
            initText();
            badge_img.setImageResource(R.drawable.achievement_everest);
setShareBtn();
        });



    }
    private void  setShareBtn(){
        if (currentWatchedItem <= openedSummit){
            fog1.setVisibility(View.GONE);
            fog2.setVisibility(View.GONE);
            shareBtn.setVisibility(View.VISIBLE);
        }else {
        if (currentWatchedItem - openedSummit == 1){
            fog1.setVisibility(View.VISIBLE);
            infoTxt.setText("Almost there keep climbing");
        }else {
            fog1.setVisibility(View.VISIBLE);
            fog2.setVisibility(View.VISIBLE);
            infoTxt.setText("The best view comes after the hardest climb");
        }
            shareBtn.setVisibility(View.GONE);

        }
    }
        private void initViews() {
        shareBtn = findViewById(R.id.share_txt);
        mj_backBtn = findViewById(R.id.mj_backBtn);
        progtext = findViewById(R.id.progress_text);

        badge_img = findViewById(R.id.badge_img);
        mt1 =findViewById(R.id.basecampArch);
        mt2 =findViewById(R.id.kirkjufellArch);
        mt3 =findViewById(R.id.elcapitanArch);
        mt4 =findViewById(R.id.mountOlympusArch);
        mt5 =findViewById(R.id.fitzroyArch);
        mt6 =findViewById(R.id.aorakiArch);
        mt7 =findViewById(R.id.mountFujiArch);
        mt8 =findViewById(R.id.matterhornArch);
        mt9 =findViewById(R.id.mountBlancArch);
        mt10 =findViewById(R.id.popocArch);
            infoTxt = findViewById(R.id.infoTxt);

        mt11 =findViewById(R.id.kilimanjaroArch);
        mt12 =findViewById(R.id.denaliArch);
        mt13 =findViewById(R.id.annapurnaArch);
        mt14 =findViewById(R.id.k2Arch);
        mt15 =findViewById(R.id.everestArch);
            fog1 = findViewById(R.id.fog5);
            fog2 = findViewById(R.id.fog6);
    }
}