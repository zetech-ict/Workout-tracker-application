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
    ImageView notificationsBtn,favorites;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

//        Init items
        greatings = view.findViewById(R.id.timeNote_text);
        notificationsBtn = view.findViewById(R.id.notificationClick);
        favorites = view.findViewById(R.id.bookmark_img);

//       / Init items


        //        Onclick
        notificationsBtn.setOnClickListener(view1 -> {
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
}