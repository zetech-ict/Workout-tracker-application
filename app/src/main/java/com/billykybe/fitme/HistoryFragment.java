package com.billykybe.fitme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class HistoryFragment extends Fragment {

    TextView today, thisWeek;
//    Data to show
int caloriesToday,caloriesThisWeek;
    int workoutToday,workoutThisWeek;
    int durationToday,durationThisWeek;

    String lastName;
    String lastDuration;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_history, container, false);
        today = view.findViewById(R.id.today_toogle_text);
        thisWeek = view.findViewById(R.id.thisweek_toggle_txt);
        today.setOnClickListener(view1 -> {
            today.setTextColor(getResources().getColor(R.color.color_secondary));
            thisWeek.setTextColor(getResources().getColor(R.color.color_text_primary));
            //TODO:Update

        });
        thisWeek.setOnClickListener(view1 -> {
            thisWeek.setTextColor(getResources().getColor(R.color.color_secondary));
            today.setTextColor(getResources().getColor(R.color.color_text_primary));
            //TODO:Update

        });

        return view;
    }
}