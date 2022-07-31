package com.billykybe.fitme;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "allWorkoutsDone")
public class History_item_model   {
    @PrimaryKey(autoGenerate = true)
    public  int hId;

    @ColumnInfo(name = "w_img")
    int w_img;

    @ColumnInfo(name = "w_name")
    String w_name;

    @ColumnInfo(name = "w_duration")
    String  w_duration;

    @ColumnInfo(name = "w_kcal")
    String  w_kcal;

    @ColumnInfo(name = "w_date")
    String w_date;

    public History_item_model ( int w_img, String w_name, String w_duration, String w_kcal, String w_date) {
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