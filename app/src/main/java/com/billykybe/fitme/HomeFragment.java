package com.billykybe.fitme;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.Calendar;
import java.util.Date;


public class HomeFragment extends Fragment {
    TextView greatings;
    boolean isMale = true;
    View featuredWorkout;
    ImageView notificationsBtn,favorites;
ImageView featuredIc,fullbodyBg,chestbg ,absBg, armsBg ,legsBg, fullbodyIm,chestIm ,absIm, armsIm ,legsIm,fullbodyAd,chestAd ,absAd, armsAd, legsAd;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
//method me

        featuredIc =  view.findViewById(R.id.heroImg);
        featuredIc.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),Workout.class);
            if (isMale){
                intent.putExtra("id","m-fullbody-bg");
            }else {
                intent.putExtra("id","f-fullbody-bg");

            }
            startActivity(intent);
        });
        fullbodyBg = view.findViewById(R.id.fb_bg);
        fullbodyBg.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),Workout.class);
            if (isMale){
                intent.putExtra("id","m-fullbody-bg");
            }else {
                intent.putExtra("id","f-fullbody-bg");

            }
            startActivity(intent);
        });
        fullbodyIm = view.findViewById(R.id.fb_im);
        fullbodyIm.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),Workout.class);
            if (isMale){
                intent.putExtra("id","m-fullbody-im");
            }else {
                intent.putExtra("id","f-fullbody-im");

            }
            startActivity(intent);
        });
        fullbodyAd = view.findViewById(R.id.fb_ad);
        fullbodyAd.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),Workout.class);
            if (isMale){
                intent.putExtra("id","m-fullbody-ad");
            }else {
                intent.putExtra("id","f-fullbody-ad");

            }
            startActivity(intent);
        });
        chestbg = view.findViewById(R.id.ch_bg);
        chestbg.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),Workout.class);
            if (isMale){
                intent.putExtra("id","m-chest-bg");
            }else {
                intent.putExtra("id","f-chest-bg");

            }
            startActivity(intent);
        });
        chestIm = view.findViewById(R.id.ch_im);
        chestIm.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),Workout.class);
            if (isMale){
                intent.putExtra("id","m-chest-im");
            }else {
                intent.putExtra("id","f-chest-im");

            }
            startActivity(intent);
        });
        chestAd = view.findViewById(R.id.ch_ad);
        chestAd.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),Workout.class);
            if (isMale){
                intent.putExtra("id","m-chest-ad");
            }else {
                intent.putExtra("id","f-chest-ad");

            }
            startActivity(intent);
        });
        absBg = view.findViewById(R.id.abs_bg);
        absBg.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),Workout.class);
            if (isMale){
                intent.putExtra("id","m-abs-bg");
            }else {
                intent.putExtra("id","f-abs-bg");

            }
            startActivity(intent);
        });
        absIm = view.findViewById(R.id.abs_im);
        absIm.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),Workout.class);
            if (isMale){
                intent.putExtra("id","m-abs-im");
            }else {
                intent.putExtra("id","f-abs-im");

            }
            startActivity(intent);
        });
        absAd = view.findViewById(R.id.abs_ad);
        absAd.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),Workout.class);
            if (isMale){
                intent.putExtra("id","m-abs-ad");
            }else {
                intent.putExtra("id","f-abs-ad");

            }
            startActivity(intent);
        });
        armsBg = view.findViewById(R.id.arm_bg);
        armsBg.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),Workout.class);
            if (isMale){
                intent.putExtra("id","m-arm-bg");
            }else {
                intent.putExtra("id","f-arm-bg");

            }
            startActivity(intent);
        });
        armsIm = view.findViewById(R.id.arm_im);
        armsIm.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),Workout.class);
            if (isMale){
                intent.putExtra("id","m-arm-im");
            }else {
                intent.putExtra("id","f-arm-im");

            }
            startActivity(intent);
        });
        armsAd = view.findViewById(R.id.arm_ad);
        armsAd.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),Workout.class);
            if (isMale){
                intent.putExtra("id","m-arm-ad");
            }else {
                intent.putExtra("id","f-arm-ad");

            }
            startActivity(intent);
        });
        legsBg = view.findViewById(R.id.leg_bg);
        legsBg.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),Workout.class);
            if (isMale){
                intent.putExtra("id","m-leg-bg");
            }else {
                intent.putExtra("id","f-leg-bg");

            }
            startActivity(intent);
        });
        legsIm = view.findViewById(R.id.leg_im);
        legsIm.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),Workout.class);
            if (isMale){
                intent.putExtra("id","m-leg-im");
            }else {
                intent.putExtra("id","f-leg-im");

            }
            startActivity(intent);
        });
        legsAd = view.findViewById(R.id.leg_ad);
        legsAd.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),Workout.class);
            if (isMale){
                intent.putExtra("id","m-leg-ad");
            }else {
                intent.putExtra("id","f-leg-ad");

            }
            startActivity(intent);
        });

        ////me me
        initImages(isMale);

//        Init items
        greatings = view.findViewById(R.id.timeNote_text);
        notificationsBtn = view.findViewById(R.id.notificationClick);
        favorites = view.findViewById(R.id.bookmark_img);
featuredWorkout = view.findViewById(R.id.ft_click);
//       / Init items


        //        Onclick
        featuredWorkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Workout.class);
                intent.putExtra("id","m-fullbody-bg");
                startActivity(intent);

            }
        });
        notificationsBtn.setOnClickListener(view1 -> {
            notificationsBtn.setImageResource(R.drawable.menu_notifications);
            Intent notificationGo = new Intent(getActivity(),Notifications.class);
            startActivity(notificationGo);

        });

        favorites.setOnClickListener(view2 -> {
            Intent notificationGo = new Intent(getActivity(),Bookmarked.class);
            startActivity(notificationGo);

        });

//        / onclick

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        String newGreatings;
        if (hour >= 12 && hour < 17) {
            newGreatings = "Good afternoon";
        } else if (hour >= 17 && hour < 21) {
            newGreatings = "Good evening";

        } else if (hour >= 21) {
            newGreatings = "Good night";

        } else {
            newGreatings = "Good morning";

        }
        greatings.setText(newGreatings);

        return view;

    }


    private void initImages(boolean isMale) {



        if (isMale){
            fullbodyBg.setImageResource(R.drawable.cover_fullbody);
            fullbodyAd.setImageResource(R.drawable.cover_fullbody);
            fullbodyIm.setImageResource(R.drawable.cover_fullbody);

            chestbg.setImageResource(R.drawable.cover_chest_1);
            chestIm.setImageResource(R.drawable.cover_chest_2);
            chestAd.setImageResource(R.drawable.cover_chest_3);

            absBg.setImageResource(R.drawable.cover_abs_1);
            absIm.setImageResource(R.drawable.cover_abs_2);
            absAd.setImageResource(R.drawable.cover_abs_3);

            armsBg.setImageResource(R.drawable.cover_arm_1);
            armsIm.setImageResource(R.drawable.cover_arm_2);
            armsAd.setImageResource(R.drawable.cover_arm_3);

            legsBg.setImageResource(R.drawable.cover_leg_1);
            legsIm.setImageResource(R.drawable.cover_leg_2);
            legsAd.setImageResource(R.drawable.cover_leg_3);

        }
        else {
            fullbodyBg.setImageResource(R.drawable.cover_female_full_body);
            fullbodyAd.setImageResource(R.drawable.cover_female_full_body);
            fullbodyIm.setImageResource(R.drawable.cover_female_full_body);

            chestbg.setImageResource(R.drawable.cover_female_chest_1);
            chestIm.setImageResource(R.drawable.cover_female_chest_2);
            chestAd.setImageResource(R.drawable.cover_female_chest_3);

            absBg.setImageResource(R.drawable.cover_female_abs_1);
            absIm.setImageResource(R.drawable.cover_female_abs_2);
            absAd.setImageResource(R.drawable.cover_female_abs_3);

            armsBg.setImageResource(R.drawable.cover_female_arm_1);
            armsIm.setImageResource(R.drawable.cover_female_arm_2);
            armsAd.setImageResource(R.drawable.cover_female_arm_3);

            legsBg.setImageResource(R.drawable.cover_female_leg_1);
            legsIm.setImageResource(R.drawable.cover_female_leg_2);
            legsAd.setImageResource(R.drawable.cover_female_leg_3);

        }


    }
}