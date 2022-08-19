package com.billykybe.fitme;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;


public class HistoryFragment extends Fragment {
ImageView lw_main_img;
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




      int  minutes = 0;
        int seconds = 0;
        for(int i = 0;i<= history_item_models.size()-1;i++){
            minutes+=Integer.parseInt(history_item_models.get(i).w_duration);
            seconds+=Integer.parseInt(history_item_models.get(i).w_durationSecs);
        }

        while (seconds > 59){
            seconds = seconds /60;
            minutes++;
        }


            duration_count_txt.setText(minutes+":"+seconds+" Minutes");



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

        String key =  history_item_models.get(0).w_name;



        int level ;
        if (key.contains("eginner")){
            level = 1;
            lwe_fb_level_img.setImageResource(R.drawable.ic_level_1);

        }else if (key.contains("termediate")) {
            level = 2;
            lwe_fb_level_img.setImageResource(R.drawable.ic_level_2);

        }else {
            level = 3;
            lwe_fb_level_img.setImageResource(R.drawable.ic_level_3);


        }
        String str_workout =        getStrings(history_item_models.get(0).w_name,level);


lw_name.setText(history_item_models.get(0).w_name);

        lw_main_img = view.findViewById(R.id.lw_main_img);
        lw_main_img.setOnClickListener(v -> {
            Intent toWorkoutLobby = new Intent(getActivity(), Workout.class);
            toWorkoutLobby.putExtra("id",str_workout);
            startActivity(toWorkoutLobby);
        });


        return view;
    }
    public String getStrings(String key,int level) {

        //===> trying to fasten the search Hackish to change


String toReturn ="";


        if (level == 1){



        switch (key) {
            case "Fullbody Beginner":
return   "m-fullbody-bg";
            case "Chest Beginner":
                return "m-chest-bg";

            case "Abs Beginner":
                return "m-abs-bg";


            case "Arms Beginner":
                return "m-arms-bg";

            case "Legs Beginner":
                return "m-legs-bg";

        }
        if (level == 2){
            switch (key) {
                case "Fullbody Intermediate":
                    return "m-fullbody-bg";

                case "Chest Intermediate":
                    return "m-chest-im";

                case "Abs Intermediate":
                    return "m-abs-im";


                case "Arms Intermediate":
                    return "m-arms-im";

                case "Legs Intermediate":
                    return "m-legs-im";

            }

        }
            if (level == 3){
                switch (key) {
                    case "Fullbody Advanced":
                        return "m-fullbody-bg";

                    case "Chest Advanced":
                        return "m-chest-ad";

                    case "Abs Advanced":
                        return "m-abs-ad";


                    case "Arms Advanced":
                        return "m-arms-ad";

                    case "Legs Advanced":
                        return "m-legs-ad";

                }
            }



        }
        return  toReturn;

    }

}