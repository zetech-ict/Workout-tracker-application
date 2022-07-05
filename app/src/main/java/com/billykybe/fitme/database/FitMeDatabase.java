package com.billykybe.fitme.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = {UserAccount.class},version = 1)
public abstract  class FitMeDatabase extends RoomDatabase {
public abstract  UserDao userDao();
private static FitMeDatabase INSTANCE;
public static FitMeDatabase getInstance(Context context){
    if (INSTANCE==null){
        INSTANCE = Room.databaseBuilder(context.getApplicationContext(),FitMeDatabase.class,"DB NAME")
                .allowMainThreadQueries()
                .build();

    }
    return INSTANCE;
}
}

