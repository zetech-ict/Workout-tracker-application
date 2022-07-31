
package com.billykybe.fitme;


import java.io.Serializable;

public class favorite_model  implements Serializable {
    private  int ID;
    int fav_image;
    int fav_level;
    String fav_title;
    String
    fav_duration;

    public favorite_model(int fav_image, int fav_level, String fav_title, String fav_duration) {
        this.fav_image = fav_image;
        this.fav_level = fav_level;
        this.fav_title = fav_title;
        this.fav_duration = fav_duration;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFav_image(int fav_image) {
        this.fav_image = fav_image;
    }

    public void setFav_level(int fav_level) {
        this.fav_level = fav_level;
    }

    public void setFav_title(String fav_title) {
        this.fav_title = fav_title;
    }

    public void setFav_duration(String fav_duration) {
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
