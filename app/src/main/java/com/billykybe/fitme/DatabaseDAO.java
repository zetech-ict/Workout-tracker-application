package com.billykybe.fitme;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DatabaseDAO {
    @Query("SELECT * FROM allWorkoutsDone ORDER BY hId DESC")
    List<History_item_model> getWorkoutsDoneList();



    @Insert
    void insertWorkoutDone(History_item_model historyItemModel);
}
