package com.billykybe.fitme;

public class Workout_items_model {
    int w_lottie ;
    String w_name,w_duration;

    public Workout_items_model(int w_lottie, String w_name, String w_duration) {
        this.w_lottie = w_lottie;
        this.w_name = w_name;
        this.w_duration = w_duration;
    }

    public int getW_lottie() {
        return w_lottie;
    }

    public String getW_name() {
        return w_name;
    }

    public String getW_duration() {
        return w_duration;
    }
}
