package com.billykybe.fitme.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.billykybe.fitme.History_item_model;

@Database(entities =  {History_item_model.class},version = 1)
public abstract class FitMeDatabase extends RoomDatabase {
    public  abstract  DoneWorkoutsDAO doneWorkoutsDAO();




}
