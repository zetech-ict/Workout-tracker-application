package com.billykybe.fitme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;


public class HistoryFragment extends Fragment {

TextView workout_count_txt,duration_count_txt,counter_text;
 ProgressBar gr_progressbar;
    TextView today, thisWeek;
//    Data to show
int caloriesToday,caloriesThisWeek;
    int workoutToday,workoutThisWeek;
    int durationToday,durationThisWeek;

    String lastName;
    String lastDuration ;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_history, container, false);


        List<History_item_model> history_item_models = new ArrayList<>();
        FittMeDatabase fittMeDatabase = FittMeDatabase.getInstance(this.getContext());
        history_item_models =
                fittMeDatabase.databaseDAO().getWorkoutsDoneList();


        caloriesThisWeek = 0;

        for(int i = 0;i<= history_item_models.size()-1;i++){
            caloriesThisWeek+=Integer.parseInt(history_item_models.get(i).w_kcal);
        }

        long timeInSeconds = 120;

        durationThisWeek = (int)timeInSeconds/60;


        workout_count_txt = view.findViewById(R.id.workout_count_txt);
        workout_count_txt.setText(String.valueOf(history_item_models.size())+" Exercises");


        duration_count_txt = view.findViewById(R.id.duration_count_txt);
        duration_count_txt.setText(String.valueOf(durationThisWeek)+" Minutes");



                        counter_text = view.findViewById(R.id.counter_text);
        counter_text.setText(String.valueOf(caloriesThisWeek));

        gr_progressbar = view.findViewById(R.id.gr_progressbar);
        gr_progressbar.setMax((int)(caloriesThisWeek*1.5));

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