package com.billykybe.fitme;

public class History_item_model {
    int w_img;
    String w_name,w_duration,w_kcal,w_date;

    public History_item_model(int w_img, String w_name, String w_duration, String w_kcal, String w_date) {
        this.w_img = w_img;
        this.w_name = w_name;
        this.w_duration = w_duration;
        this.w_kcal = w_kcal;
        this.w_date = w_date;
    }

    public int getW_img() {
        return w_img;
    }

    public String getW_name() {
        return w_name;
    }

    public String getW_duration() {
        return w_duration;
    }

    public String getW_kcal() {
        return w_kcal;
    }

    public String getW_date() {
        return w_date;
    }
}