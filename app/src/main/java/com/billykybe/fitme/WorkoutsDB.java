package com.billykybe.fitme;

import java.util.ArrayList;
import java.util.List;

public class WorkoutsDB {
     List<Workout_items_model> workouts = new ArrayList<>();
String level = "";

     public WorkoutsDB(String level){

         switch (level){
             case "m-fullbody-bg":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo001_side_leg_lift, " 1Side Leg Lift", "3"));
                 workouts.add(new Workout_items_model(R.raw.bo002_mountain_climbers, "2Mountain Climbers", "6"));

                 workouts.add(new Workout_items_model(R.raw.bo004_frog_jumps, "3Frog Jumps", "8"));
                 workouts.add(new Workout_items_model(R.raw.bo058_front_wrist_stretch, "4Front Wrist Stretch", "10"));

                 workouts.add(new Workout_items_model(R.raw.bo001_side_leg_lift, "5Side Leg Lift", "3"));
                 workouts.add(new Workout_items_model(R.raw.bo002_mountain_climbers, "6Mountain Climbers", "6"));

                 workouts.add(new Workout_items_model(R.raw.bo004_frog_jumps, "7Frog Jumps", "8"));
                 workouts.add(new Workout_items_model(R.raw.bo058_front_wrist_stretch, "8Front Wrist Stretch", "10"));

                 workouts.add(new Workout_items_model(R.raw.bo001_side_leg_lift, "9Side Leg Lift", "3"));
                 workouts.add(new Workout_items_model(R.raw.bo002_mountain_climbers, "10Mountain Climbers", "6"));

                 workouts.add(new Workout_items_model(R.raw.bo004_frog_jumps, "11Frog Jumps", "8"));
                 workouts.add(new Workout_items_model(R.raw.bo058_front_wrist_stretch, "12Front Wrist Stretch", "10"));

                 break;


         }
     }
     public  List<Workout_items_model> getList(){
         return workouts;
     }




}
