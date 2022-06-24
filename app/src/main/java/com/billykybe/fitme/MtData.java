package com.billykybe.fitme;

import java.time.LocalDate;
import java.util.Date;

public class MtData {
   private String name = "code red";
    private int img = 1;
    private int height =1;
    private int month = 1,day=1,year = 1;


    public MtData(String name, int img, int height, int month, int day, int year) {
        this.name = name;
        this.img = img;
        this.height = height;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
