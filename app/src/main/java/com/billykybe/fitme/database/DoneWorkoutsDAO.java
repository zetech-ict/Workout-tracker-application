package com.billykybe.fitme.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.billykybe.fitme.History_item_model;

import java.util.List;

@Dao
public interface DoneWorkoutsDAO {
    @Query("SELECT * FROM history_table")
    List<History_item_model> getAll();

    @Insert
    void insertWorkouDone(History_item_model... historyItemModels);



}
