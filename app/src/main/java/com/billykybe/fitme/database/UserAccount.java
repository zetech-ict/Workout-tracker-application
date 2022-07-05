package com.billykybe.fitme.database;

import androidx.room.ColumnInfo;
import androidx.room.Dao;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.Query;

import com.billykybe.fitme.favorite_model;

import java.util.List;

@Entity
public class UserAccount {
    @PrimaryKey(autoGenerate = true)
    int id;

    @ColumnInfo(name = "user_email")
    String email;
    @ColumnInfo(name = "user_pin")
    int pinSecurity;
    @ColumnInfo(name = "user_name")
    String name;
    @ColumnInfo(name = "is_male")
    boolean isMale;
    @ColumnInfo(name = "user_age")
int age;
    @ColumnInfo(name = "user_wheight")
    int wheight ;
    @ColumnInfo(name = "user_height")

    int height;
    @ColumnInfo(name = "user_workout_level")

    int levelOfWorkout ;
    @ColumnInfo(name = "userWhyWorkout")

    int whyWorkout [] = new int[5];
    @ColumnInfo(name = "userLastWorkout")
    favorite_model lastWorkout ;




    public UserAccount(int id, favorite_model lastWorkout ,String email, String name ,boolean isMale,  int age, int wheight, int height, int levelOfWorkout, int[] whyWorkout, int contryCode) {
        this.id = id;
        this.lastWorkout =lastWorkout;
        this.email = email;
        this.isMale=isMale;

        this.name = name;
        this.age = age;
        this.wheight = wheight;
        this.height = height;
        this.levelOfWorkout = levelOfWorkout;
        this.whyWorkout = whyWorkout;
    }

    public UserAccount() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public favorite_model getLastWorkout() {
        return lastWorkout;
    }

    public void setLastWorkout(favorite_model lastWorkout) {
        this.lastWorkout = lastWorkout;
    }

    public int getPinSecurity() {
        return pinSecurity;
    }

    public void setPinSecurity(int pinSecurity) {
        this.pinSecurity = pinSecurity;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWheight() {
        return wheight;
    }

    public void setWheight(int wheight) {
        this.wheight = wheight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLevelOfWorkout() {
        return levelOfWorkout;
    }

    public void setLevelOfWorkout(int levelOfWorkout) {
        this.levelOfWorkout = levelOfWorkout;
    }

    public int[] getWhyWorkout() {
        return whyWorkout;
    }

    public void setWhyWorkout(int[] whyWorkout) {
        this.whyWorkout = whyWorkout;
    }


}
