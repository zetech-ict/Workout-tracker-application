package com.billykybe.fitme;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = History_item_model.class,exportSchema = false,version = 1)
public abstract class FittMeDatabase extends RoomDatabase {
    private  static final String DB_NAME = "workouts_done_db";
    private static FittMeDatabase instance;

    public static synchronized FittMeDatabase getInstance(Context context){
        if (instance==null){
            instance = Room.databaseBuilder(context.getApplicationContext(),FittMeDatabase.class,DB_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration().build();
        }
        return instance;
    }
    public abstract DatabaseDAO databaseDAO();

}
