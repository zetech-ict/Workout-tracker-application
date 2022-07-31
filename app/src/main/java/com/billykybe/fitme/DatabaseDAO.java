package com.billykybe.fitme;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface DatabaseDAO {
    @Query("SELECT * FROM allWorkoutsDone")
    List<History_item_model> getWorkoutsDoneList();

    @Insert
    void insertWorkoutDone(History_item_model historyItemModel);
}
