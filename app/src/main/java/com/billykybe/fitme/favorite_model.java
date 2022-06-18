package com.billykybe.fitme;public class favorite_model {

    int fav_image,fav_level;
    String fav_title,fav_duration;

    public favorite_model(int fav_image, int fav_level, String fav_title, String fav_duration) {
        this.fav_image = fav_image;
        this.fav_level = fav_level;
        this.fav_title = fav_title;
        this.fav_duration = fav_duration;
    }

    public int getFav_image() {
        return fav_image;
    }

    public int getFav_level() {
        return fav_level;
    }

    public String getFav_title() {
        return fav_title;
    }

    public String getFav_duration() {
        return fav_duration;
    }
}
