package com.billykybe.fitme;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;


public class HomeFragment extends Fragment {
TextView greatings ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        greatings = view.findViewById(R.id.timeNote_text);

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