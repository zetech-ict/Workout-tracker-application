package com.billykybe.fitme;

import java.util.ArrayList;
import java.util.List;

public class WorkoutsDB {
     List<Workout_items_model> workouts = new ArrayList<>();
String level = "";

     public WorkoutsDB(String level){

         switch (level){
             case "f-fullbody-bg":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo323_incline_pushups, "Incline Push-Ups", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo214_kneeled_pushups, "Knee Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo323_incline_pushups, "Incline Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo214_kneeled_pushups, "Knee Push-Ups", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo104_low_cobra, "Cobra Stretch", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo145_resisted_chest_stretch, "Chest Stretch", "30"));

                 break;

             case "f-chest-bg":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo323_incline_pushups, "Incline Push-Ups", "10"));

                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "10"));

                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo199_tricep_dips, "Triceps Dips", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo323_incline_pushups, "Incline Push-Ups", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo199_tricep_dips, "Triceps Dips", "15"));



                 workouts.add(new Workout_items_model(R.raw.bo214_kneeled_pushups, "Knee Push-Ups", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo104_low_cobra, "Cobra Stretch", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo145_resisted_chest_stretch, "Chest Stretch", "20"));



                 break;



             case "f-abs-bg":
                 workouts.clear();


                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo195_russian_twist, "Russian Twist", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo358_abdominal_marching, "Abdominal Marching", "15"));



                 workouts.add(new Workout_items_model(R.raw.bo002_mountain_climbers, "Mountain Climber", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo356_heel_touches, "Heel Touches", "25"));
                 workouts.add(new Workout_items_model(R.raw.bo359_alternating_leg_raises, "Leg Raises", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo310_plank, "Plank", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo203_crunches, "Abdominal Crunches", "15"));



                 workouts.add(new Workout_items_model(R.raw.bo195_russian_twist, "Russian Twist", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo002_mountain_climbers, "Mountain Climber", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo356_heel_touches, "Heel Touches", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo359_alternating_leg_raises, "Leg Raises", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo310_plank, "Plank", "35"));
                 workouts.add(new Workout_items_model(R.raw.bo104_low_cobra, "Cobra Stretch", "35"));
                 workouts.add(new Workout_items_model(R.raw.bo169_lumbar_rotation, "Lumber Rotation", "35"));
                 workouts.add(new Workout_items_model(R.raw.bo367_cross_legged_lumbar_rotation, "Cross Legged Lumber Rotation", "35"));


                 break;



             case "f-arm-bg":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo204_arm_raise_plank, "Arm Raise Plank", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo199_tricep_dips, "Triceps Dip", "10"));



                 workouts.add(new Workout_items_model(R.raw.bo133_arm_circles, "Arm Circles", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo236_diamond_push_ups, "Diamond Push-Ups", "10"));

                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "25"));
                 workouts.add(new Workout_items_model(R.raw.bo322_bicep_curls, "Bicep Curls", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo309_plank_pushups, "Plank Push-Ups", "20"));

                 workouts.add(new Workout_items_model(R.raw.bo227_punching_squat, "Punching Squat", "30"));




                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo354_inchwarms, "Inchworms", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo225_hindu_pushups, "Hindu Push-Ups", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo335_tricep_stretch, "Triceps Stretch", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo351_wall_tricep_press, "Wall Triceps Press", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo199_tricep_dips, "Triceps Press", "20"));

                 break;

             case "f-leg-bg":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo228_one_leg_side_hops, "Side Hop", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo009_squats, "Squats", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo191_side_plank_balancing, "Side Plank Balancing", "8"));


                 workouts.add(new Workout_items_model(R.raw.bo003_back_forth_squat, "Back forth Squats", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo018_one_calf_raises, "One Calf Raises", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo001_side_leg_lift, "Side Leg Lift", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo023_one_leg_jumps, "One leg Jumps", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo321_single_leg_plank, "Single leg plank", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo150_quadricep_stretch, "Quadricap Stretch", "30"));



                 workouts.add(new Workout_items_model(R.raw.bo019_calf_raises, "Calf Raises", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo011_sumo_squat, "Sumo Squat", "16"));
                 workouts.add(new Workout_items_model(R.raw.bo146_sprinters_calf_stretch, "Sprinters Calf Stretch", "20"));

                 break;


             case "f-fullbody-im":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo323_incline_pushups, "Incline Push-Ups", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo104_low_cobra, "Cobra Stretch", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo145_resisted_chest_stretch, "Chest Stretch", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo214_kneeled_pushups, "Knee Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo323_incline_pushups, "Incline Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo214_kneeled_pushups, "Knee Push-Ups", "30"));

                 break;

             case "f-chest-im":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "30"));




                 workouts.add(new Workout_items_model(R.raw.bo214_kneeled_pushups, "Knee Push-Ups", "10"));

                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "10"));

                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo225_hindu_pushups, "Hindu Push-Ups", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo145_resisted_chest_stretch, "Resisted Chest Stretch", "10"));


                 workouts.add(new Workout_items_model(R.raw.bo324_decline_pushups, "Decline Push-Ups", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo095_backward_shoulder_circles, "Backward Shoulder Circles", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo096_front_shoulder_circles, "Front Shoulder Circles", "15"));



                 workouts.add(new Workout_items_model(R.raw.bo145_resisted_chest_stretch, "Chest Stretch", "10"));



                 break;



             case "f-abs-im":
                 workouts.clear();


                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo356_heel_touches, "Heel Touch", "25"));
                 workouts.add(new Workout_items_model(R.raw.bo002_mountain_climbers, "Mountain Climber", "20"));

                 workouts.add(new Workout_items_model(R.raw.bo055_elevated_crunches, "Elevated Crunch", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo001_side_leg_lift, "Side Leg Lift", "25"));



                 workouts.add(new Workout_items_model(R.raw.bo314_easy_side_plank_raises, "Side Plank Raises", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo310_plank, "Plank", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo316_reverse_plank, "Reverse Plank", "15"));



                 workouts.add(new Workout_items_model(R.raw.bo355_bicycle_crunch, "Bicycle Crunches", "30"));



                 workouts.add(new Workout_items_model(R.raw.bo054_v_sit_ups, "V-SitUps", "20"));


                 workouts.add(new Workout_items_model(R.raw.bo356_heel_touches, "Heel Touches", "20"));


                 workouts.add(new Workout_items_model(R.raw.bo203_crunches, "Crunches", "15"));


                 workouts.add(new Workout_items_model(R.raw.bo310_plank, "Plank", "35"));


                 workouts.add(new Workout_items_model(R.raw.bo359_alternating_leg_raises, "Alternating Leg Rise", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo355_bicycle_crunch, "Bicycle Crunches", "25"));
                 workouts.add(new Workout_items_model(R.raw.bo200_push_up_and_rotation, "Push-Ups & Rotation", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo104_low_cobra, "Cobra Stretch", "30"));


                 break;



             case "f-arm-im":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo133_arm_circles, "Arm Circles", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo199_tricep_dips, "Triceps Dip", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo227_punching_squat, "Punching Squat", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo322_bicep_curls, "Bicep Curls", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo199_tricep_dips, "Triceps Dip", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo200_push_up_and_rotation, "Push-Ups & Rotation", "25"));
                 workouts.add(new Workout_items_model(R.raw.bo322_bicep_curls, "Bicep Curls", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo227_punching_squat, "Punching Squat", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo075_burpees, "Burpees", "25"));
                 workouts.add(new Workout_items_model(R.raw.bo337_opposite_arm_circles, "Opposite Arm Circles", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo335_tricep_stretch, "Triceps Stretch", "20"));




                 break;

             case "f-leg-im":
                 workouts.clear();

                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo009_squats, "Squats", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo040_plank_and_rear_kick, "Fire Hydrant", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo009_squats, "Squats", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo228_one_leg_side_hops, "Side Hop", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo011_sumo_squat, "Sumo Squats", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo063_donkey_kick, "Donkey Kick", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo011_sumo_squat, "Sumo Squats", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo018_one_calf_raises, "One Calf Raises", "30"));


                 workouts.add(new Workout_items_model(R.raw.bo191_side_plank_balancing, "Side Plank Balancing", "8"));


                 workouts.add(new Workout_items_model(R.raw.bo003_back_forth_squat, "Back forth Squats", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo001_side_leg_lift, "Side Leg Lift", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo023_one_leg_jumps, "One leg Jumps", "15"));

                 break;






             case "f-fullbody-ad":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo323_incline_pushups, "Incline Push-Ups", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo104_low_cobra, "Cobra Stretch", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo145_resisted_chest_stretch, "Chest Stretch", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo214_kneeled_pushups, "Knee Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo104_low_cobra, "Cobra Stretch", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo145_resisted_chest_stretch, "Chest Stretch", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo323_incline_pushups, "Incline Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo214_kneeled_pushups, "Knee Push-Ups", "30"));

                 break;

             case "f-chest-ad":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "30"));




                 workouts.add(new Workout_items_model(R.raw.bo214_kneeled_pushups, "Knee Push-Ups", "10"));

                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo324_decline_pushups, "Decline Push-Ups", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo095_backward_shoulder_circles, "Backward Shoulder Circles", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo096_front_shoulder_circles, "Front Shoulder Circles", "15"));


                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo225_hindu_pushups, "Hindu Push-Ups", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo145_resisted_chest_stretch, "Resisted Chest Stretch", "10"));




                 workouts.add(new Workout_items_model(R.raw.bo145_resisted_chest_stretch, "Chest Stretch", "10"));



                 break;



             case "f-abs-ad":
                 workouts.clear();


                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo356_heel_touches, "Heel Touch", "25"));
                 workouts.add(new Workout_items_model(R.raw.bo002_mountain_climbers, "Mountain Climber", "20"));

                 workouts.add(new Workout_items_model(R.raw.bo055_elevated_crunches, "Elevated Crunch", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo001_side_leg_lift, "Side Leg Lift", "25"));



                 workouts.add(new Workout_items_model(R.raw.bo314_easy_side_plank_raises, "Side Plank Raises", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo310_plank, "Plank", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo316_reverse_plank, "Reverse Plank", "15"));



                 workouts.add(new Workout_items_model(R.raw.bo355_bicycle_crunch, "Bicycle Crunches", "30"));



                 workouts.add(new Workout_items_model(R.raw.bo054_v_sit_ups, "V-SitUps", "20"));

                 workouts.add(new Workout_items_model(R.raw.bo310_plank, "Plank", "35"));


                 workouts.add(new Workout_items_model(R.raw.bo359_alternating_leg_raises, "Alternating Leg Rise", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo355_bicycle_crunch, "Bicycle Crunches", "25"));
                 workouts.add(new Workout_items_model(R.raw.bo200_push_up_and_rotation, "Push-Ups & Rotation", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo104_low_cobra, "Cobra Stretch", "30"));


                 workouts.add(new Workout_items_model(R.raw.bo356_heel_touches, "Heel Touches", "20"));


                 workouts.add(new Workout_items_model(R.raw.bo203_crunches, "Crunches", "15"));



                 break;



             case "f-arm-ad":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo199_tricep_dips, "Triceps Dip", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo200_push_up_and_rotation, "Push-Ups & Rotation", "25"));
                 workouts.add(new Workout_items_model(R.raw.bo322_bicep_curls, "Bicep Curls", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo227_punching_squat, "Punching Squat", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo075_burpees, "Burpees", "25"));
                 workouts.add(new Workout_items_model(R.raw.bo337_opposite_arm_circles, "Opposite Arm Circles", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo335_tricep_stretch, "Triceps Stretch", "20"));

                 workouts.add(new Workout_items_model(R.raw.bo133_arm_circles, "Arm Circles", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo199_tricep_dips, "Triceps Dip", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo227_punching_squat, "Punching Squat", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo322_bicep_curls, "Bicep Curls", "10"));




                 break;

             case "f-leg-ad":
                 workouts.clear();

                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo009_squats, "Squats", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo040_plank_and_rear_kick, "Fire Hydrant", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo009_squats, "Squats", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo228_one_leg_side_hops, "Side Hop", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo018_one_calf_raises, "One Calf Raises", "30"));


                 workouts.add(new Workout_items_model(R.raw.bo191_side_plank_balancing, "Side Plank Balancing", "8"));


                 workouts.add(new Workout_items_model(R.raw.bo003_back_forth_squat, "Back forth Squats", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo001_side_leg_lift, "Side Leg Lift", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo023_one_leg_jumps, "One leg Jumps", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo011_sumo_squat, "Sumo Squats", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo063_donkey_kick, "Donkey Kick", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo011_sumo_squat, "Sumo Squats", "15"));


                 break;







                 //TODO: Edit Male workout


             case "m-fullbody-bg":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo323_incline_pushups, "Incline Push-Ups", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo214_kneeled_pushups, "Knee Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo323_incline_pushups, "Incline Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo214_kneeled_pushups, "Knee Push-Ups", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo104_low_cobra, "Cobra Stretch", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo104_low_cobra, "Cobra Stretch", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo145_resisted_chest_stretch, "Chest Stretch", "30"));

                 break;

             case "m-chest-bg":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo323_incline_pushups, "Incline Push-Ups", "10"));

                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "10"));

                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo199_tricep_dips, "Triceps Dips", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo323_incline_pushups, "Incline Push-Ups", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo199_tricep_dips, "Triceps Dips", "15"));



                 workouts.add(new Workout_items_model(R.raw.bo214_kneeled_pushups, "Knee Push-Ups", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo214_kneeled_pushups, "Knee Push-Ups", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo104_low_cobra, "Cobra Stretch", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo145_resisted_chest_stretch, "Chest Stretch", "20"));



                 break;



             case "m-abs-bg":
                 workouts.clear();


                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo195_russian_twist, "Russian Twist", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo358_abdominal_marching, "Abdominal Marching", "15"));



                 workouts.add(new Workout_items_model(R.raw.bo002_mountain_climbers, "Mountain Climber", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo356_heel_touches, "Heel Touches", "25"));
                 workouts.add(new Workout_items_model(R.raw.bo359_alternating_leg_raises, "Leg Raises", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo310_plank, "Plank", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo203_crunches, "Abdominal Crunches", "15"));



                 workouts.add(new Workout_items_model(R.raw.bo195_russian_twist, "Russian Twist", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo002_mountain_climbers, "Mountain Climber", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo002_mountain_climbers, "Mountain Climber", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo356_heel_touches, "Heel Touches", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo359_alternating_leg_raises, "Leg Raises", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo310_plank, "Plank", "35"));
                 workouts.add(new Workout_items_model(R.raw.bo104_low_cobra, "Cobra Stretch", "35"));
                 workouts.add(new Workout_items_model(R.raw.bo169_lumbar_rotation, "Lumber Rotation", "35"));
                 workouts.add(new Workout_items_model(R.raw.bo367_cross_legged_lumbar_rotation, "Cross Legged Lumber Rotation", "35"));


                 break;



             case "m-arm-bg":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo204_arm_raise_plank, "Arm Raise Plank", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo199_tricep_dips, "Triceps Dip", "10"));



                 workouts.add(new Workout_items_model(R.raw.bo133_arm_circles, "Arm Circles", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo236_diamond_push_ups, "Diamond Push-Ups", "10"));

                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "25"));
                 workouts.add(new Workout_items_model(R.raw.bo322_bicep_curls, "Bicep Curls", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo309_plank_pushups, "Plank Push-Ups", "20"));

                 workouts.add(new Workout_items_model(R.raw.bo227_punching_squat, "Punching Squat", "30"));




                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo354_inchwarms, "Inchworms", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo225_hindu_pushups, "Hindu Push-Ups", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo335_tricep_stretch, "Triceps Stretch", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo351_wall_tricep_press, "Wall Triceps Press", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo199_tricep_dips, "Triceps Press", "20"));

                 break;

             case "m-leg-bg":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo228_one_leg_side_hops, "Side Hop", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo009_squats, "Squats", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo191_side_plank_balancing, "Side Plank Balancing", "8"));


                 workouts.add(new Workout_items_model(R.raw.bo003_back_forth_squat, "Back forth Squats", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo018_one_calf_raises, "One Calf Raises", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo001_side_leg_lift, "Side Leg Lift", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo023_one_leg_jumps, "One leg Jumps", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo321_single_leg_plank, "Single leg plank", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo150_quadricep_stretch, "Quadricap Stretch", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo150_quadricep_stretch, "Quadricap Stretch", "30"));



                 workouts.add(new Workout_items_model(R.raw.bo019_calf_raises, "Calf Raises", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo011_sumo_squat, "Sumo Squat", "16"));
                 workouts.add(new Workout_items_model(R.raw.bo146_sprinters_calf_stretch, "Sprinters Calf Stretch", "20"));

                 break;


             case "m-fullbody-im":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo323_incline_pushups, "Incline Push-Ups", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo104_low_cobra, "Cobra Stretch", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo145_resisted_chest_stretch, "Chest Stretch", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo214_kneeled_pushups, "Knee Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo323_incline_pushups, "Incline Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo214_kneeled_pushups, "Knee Push-Ups", "30"));

                 break;

             case "m-chest-im":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "30"));




                 workouts.add(new Workout_items_model(R.raw.bo214_kneeled_pushups, "Knee Push-Ups", "10"));

                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo324_decline_pushups, "Decline Push-Ups", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo225_hindu_pushups, "Hindu Push-Ups", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo145_resisted_chest_stretch, "Resisted Chest Stretch", "10"));


                 workouts.add(new Workout_items_model(R.raw.bo324_decline_pushups, "Decline Push-Ups", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo095_backward_shoulder_circles, "Backward Shoulder Circles", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo096_front_shoulder_circles, "Front Shoulder Circles", "15"));



                 workouts.add(new Workout_items_model(R.raw.bo145_resisted_chest_stretch, "Chest Stretch", "10"));



                 break;



             case "m-abs-im":
                 workouts.clear();


                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo356_heel_touches, "Heel Touch", "25"));
                 workouts.add(new Workout_items_model(R.raw.bo002_mountain_climbers, "Mountain Climber", "20"));

                 workouts.add(new Workout_items_model(R.raw.bo055_elevated_crunches, "Elevated Crunch", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo001_side_leg_lift, "Side Leg Lift", "25"));



                 workouts.add(new Workout_items_model(R.raw.bo314_easy_side_plank_raises, "Side Plank Raises", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo310_plank, "Plank", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo316_reverse_plank, "Reverse Plank", "15"));



                 workouts.add(new Workout_items_model(R.raw.bo355_bicycle_crunch, "Bicycle Crunches", "30"));



                 workouts.add(new Workout_items_model(R.raw.bo054_v_sit_ups, "V-SitUps", "20"));


                 workouts.add(new Workout_items_model(R.raw.bo356_heel_touches, "Heel Touches", "20"));


                 workouts.add(new Workout_items_model(R.raw.bo203_crunches, "Crunches", "15"));


                 workouts.add(new Workout_items_model(R.raw.bo310_plank, "Plank", "35"));


                 workouts.add(new Workout_items_model(R.raw.bo359_alternating_leg_raises, "Alternating Leg Rise", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo355_bicycle_crunch, "Bicycle Crunches", "25"));
                 workouts.add(new Workout_items_model(R.raw.bo200_push_up_and_rotation, "Push-Ups & Rotation", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo200_push_up_and_rotation, "Push-Ups & Rotation", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo104_low_cobra, "Cobra Stretch", "30"));


                 break;



             case "m-arm-im":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo133_arm_circles, "Arm Circles", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo199_tricep_dips, "Triceps Dip", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo227_punching_squat, "Punching Squat", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo322_bicep_curls, "Bicep Curls", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo199_tricep_dips, "Triceps Dip", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo199_tricep_dips, "Triceps Dip", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo200_push_up_and_rotation, "Push-Ups & Rotation", "25"));
                 workouts.add(new Workout_items_model(R.raw.bo322_bicep_curls, "Bicep Curls", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo227_punching_squat, "Punching Squat", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo075_burpees, "Burpees", "25"));
                 workouts.add(new Workout_items_model(R.raw.bo337_opposite_arm_circles, "Opposite Arm Circles", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo335_tricep_stretch, "Triceps Stretch", "20"));




                 break;

             case "m-leg-im":
                 workouts.clear();

                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo009_squats, "Squats", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo040_plank_and_rear_kick, "Fire Hydrant", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo009_squats, "Squats", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo228_one_leg_side_hops, "Side Hop", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo023_one_leg_jumps, "One leg Jumps", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo011_sumo_squat, "Sumo Squats", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo063_donkey_kick, "Donkey Kick", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo011_sumo_squat, "Sumo Squats", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo018_one_calf_raises, "One Calf Raises", "30"));


                 workouts.add(new Workout_items_model(R.raw.bo191_side_plank_balancing, "Side Plank Balancing", "8"));


                 workouts.add(new Workout_items_model(R.raw.bo003_back_forth_squat, "Back forth Squats", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo001_side_leg_lift, "Side Leg Lift", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo023_one_leg_jumps, "One leg Jumps", "15"));

                 break;






             case "m-fullbody-ad":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo323_incline_pushups, "Incline Push-Ups", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo145_resisted_chest_stretch, "Chest Stretch", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo104_low_cobra, "Cobra Stretch", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo145_resisted_chest_stretch, "Chest Stretch", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo214_kneeled_pushups, "Knee Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo104_low_cobra, "Cobra Stretch", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo145_resisted_chest_stretch, "Chest Stretch", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo323_incline_pushups, "Incline Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo214_kneeled_pushups, "Knee Push-Ups", "30"));

                 break;

             case "m-chest-ad":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "30"));




                 workouts.add(new Workout_items_model(R.raw.bo214_kneeled_pushups, "Knee Push-Ups", "10"));

                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo324_decline_pushups, "Decline Push-Ups", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo095_backward_shoulder_circles, "Backward Shoulder Circles", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo096_front_shoulder_circles, "Front Shoulder Circles", "15"));


                 workouts.add(new Workout_items_model(R.raw.bo235_wide_arm_push_ups, "Wide Arm Push-Ups", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo225_hindu_pushups, "Hindu Push-Ups", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo145_resisted_chest_stretch, "Resisted Chest Stretch", "10"));

                 workouts.add(new Workout_items_model(R.raw.bo096_front_shoulder_circles, "Front Shoulder Circles", "15"));



                 workouts.add(new Workout_items_model(R.raw.bo145_resisted_chest_stretch, "Chest Stretch", "10"));



                 break;



             case "m-abs-ad":
                 workouts.clear();


                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo356_heel_touches, "Heel Touch", "25"));
                 workouts.add(new Workout_items_model(R.raw.bo002_mountain_climbers, "Mountain Climber", "20"));

                 workouts.add(new Workout_items_model(R.raw.bo055_elevated_crunches, "Elevated Crunch", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo001_side_leg_lift, "Side Leg Lift", "25"));



                 workouts.add(new Workout_items_model(R.raw.bo314_easy_side_plank_raises, "Side Plank Raises", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo310_plank, "Plank", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo316_reverse_plank, "Reverse Plank", "15"));



                 workouts.add(new Workout_items_model(R.raw.bo355_bicycle_crunch, "Bicycle Crunches", "30"));



                 workouts.add(new Workout_items_model(R.raw.bo054_v_sit_ups, "V-SitUps", "20"));

                 workouts.add(new Workout_items_model(R.raw.bo310_plank, "Plank", "35"));

                 workouts.add(new Workout_items_model(R.raw.bo200_push_up_and_rotation, "Push-Ups & Rotation", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo359_alternating_leg_raises, "Alternating Leg Rise", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo355_bicycle_crunch, "Bicycle Crunches", "25"));
                 workouts.add(new Workout_items_model(R.raw.bo200_push_up_and_rotation, "Push-Ups & Rotation", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo104_low_cobra, "Cobra Stretch", "30"));


                 workouts.add(new Workout_items_model(R.raw.bo356_heel_touches, "Heel Touches", "20"));


                 workouts.add(new Workout_items_model(R.raw.bo203_crunches, "Crunches", "15"));



                 break;



             case "m-arm-ad":
                 workouts.clear();
                 workouts.add(new Workout_items_model(R.raw.bo199_tricep_dips, "Triceps Dip", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo200_push_up_and_rotation, "Push-Ups & Rotation", "25"));
                 workouts.add(new Workout_items_model(R.raw.bo322_bicep_curls, "Bicep Curls", "10"));
                 workouts.add(new Workout_items_model(R.raw.bo227_punching_squat, "Punching Squat", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo075_burpees, "Burpees", "25"));
                 workouts.add(new Workout_items_model(R.raw.bo337_opposite_arm_circles, "Opposite Arm Circles", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo335_tricep_stretch, "Triceps Stretch", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo335_tricep_stretch, "Triceps Stretch", "20"));

                 workouts.add(new Workout_items_model(R.raw.bo133_arm_circles, "Arm Circles", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo199_tricep_dips, "Triceps Dip", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo233_push_ups, "Push-Ups", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo227_punching_squat, "Punching Squat", "20"));
                 workouts.add(new Workout_items_model(R.raw.bo322_bicep_curls, "Bicep Curls", "10"));




                 break;

             case "m-leg-ad":
                 workouts.clear();

                 workouts.add(new Workout_items_model(R.raw.bo217_jumping_jacks, "Jumping Jacks", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo009_squats, "Squats", "15"));
                 workouts.add(new Workout_items_model(R.raw.bo040_plank_and_rear_kick, "Fire Hydrant", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo009_squats, "Squats", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo228_one_leg_side_hops, "Side Hop", "30"));
                 workouts.add(new Workout_items_model(R.raw.bo018_one_calf_raises, "One Calf Raises", "30"));


                 workouts.add(new Workout_items_model(R.raw.bo191_side_plank_balancing, "Side Plank Balancing", "8"));
                 workouts.add(new Workout_items_model(R.raw.bo011_sumo_squat, "Sumo Squats", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo063_donkey_kick, "Donkey Kick", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo011_sumo_squat, "Sumo Squats", "15"));


                 workouts.add(new Workout_items_model(R.raw.bo003_back_forth_squat, "Back forth Squats", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo001_side_leg_lift, "Side Leg Lift", "30"));

                 workouts.add(new Workout_items_model(R.raw.bo023_one_leg_jumps, "One leg Jumps", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo011_sumo_squat, "Sumo Squats", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo063_donkey_kick, "Donkey Kick", "15"));

                 workouts.add(new Workout_items_model(R.raw.bo011_sumo_squat, "Sumo Squats", "15"));


                 break;




         }
     }
     public  List<Workout_items_model> getList(){
         return workouts;
     }




}
