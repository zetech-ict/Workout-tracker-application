package com.billykybe.fitme;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = History_item_model.class,exportSchema = false,version = 1)
public abstract class FittMeDatabase extends RoomDatabase {
    private  static final String DB_NAME = "workouts_done_db";
    private static FittMeDatabase instance;

    public static synchronized FittMeDatabase getInstance(Context context){
        if (instance==null){
            instance = Room.databaseBuilder(context.getApplicationContext(),FittMeDatabase.class,DB_NAME)
                    .fallbackToDestructiveMigration().build();
        }
        return instance;
    }
    public abstract DatabaseDAO databaseDAO();

}
