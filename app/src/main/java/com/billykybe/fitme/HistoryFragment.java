package com.billykybe.fitme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

TextView lw_name,lw_duration;
ImageView lwe_fb_level_img;
    public List<Workout_items_model> workout_list = new ArrayList<>();


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





        workout_count_txt = view.findViewById(R.id.workout_count_txt);
        workout_count_txt.setText(String.valueOf(history_item_models.size())+" Exercises");


        duration_count_txt = view.findViewById(R.id.duration_count_txt);
        int totalTime = 0;
        for (int i = 0; i < history_item_models.size()-1; i++) {
            totalTime += Integer.parseInt(history_item_models.get(i).w_duration);
        }
        if (totalTime>999){
            totalTime = totalTime /1000;
            duration_count_txt.setText(totalTime+"K"+" Minutes");
        }else {
            duration_count_txt.setText(totalTime+" Minutes");
        }
//TODO:


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


        lwe_fb_level_img = view.findViewById(R.id.lwe_fb_level_img);
        lw_duration = view.findViewById(R.id.lw_duration);
        lw_name = view.findViewById(R.id.lw_name);

        String str_workout =        getStrings(history_item_models.get(0).w_name,1);

        WorkoutsDB workoutsDB = new WorkoutsDB(str_workout);
        workout_list = workoutsDB.getList();
lw_name.setText();

        lwe_fb_level_img.setImageResource(history_item_models.get(0).);

        return view;
    }
    public String getStrings(String key,int level) {

        //===> trying to fasten the search Hackish to change




        String toReturn = "";
        if (level == 1){



        switch (key) {
            case "Fullbody Beginner":
toReturn = "m-fullbody-bg";
                break;
            case "Chest Beginner":
                toReturn = "m-chest-bg";

                break;
            case "Abs Beginner":
                toReturn = "m-abs-bg";

                break;

            case "Arms Beginner":
                toReturn = "m-arms-bg";

                break;
            case "Legs Beginner":
                toReturn = "m-legs-bg";

                break;
        }
        if (level == 2){
            switch (key) {
                case "Fullbody Intermediate":
                    toReturn = "m-fullbody-bg";

                    break;
                case "Chest Intermediate":
                    toReturn = "m-chest-im";

                    break;
                case "Abs Intermediate":
                    toReturn = "m-abs-im";

                    break;

                case "Arms Intermediate":
                    toReturn = "m-arms-im";

                    break;
                case "Legs Intermediate":
                    toReturn = "m-legs-im";

                    break;
            }

        }
            if (level == 3){
                switch (key) {
                    case "Fullbody Advanced":
                        toReturn = "m-fullbody-bg";

                        break;
                    case "Chest Advanced":
                        toReturn = "m-chest-ad";

                        break;
                    case "Abs Advanced":
                        toReturn = "m-abs-ad";

                        break;

                    case "Arms Advanced":
                        toReturn = "m-arms-ad";

                        break;
                    case "Legs Advanced":
                        toReturn = "m-legs-ad";

                        break;
                }
            }
            else {
                toReturn = "m-fullbody-bg";

            }



        }
        return  toReturn;

    }

}