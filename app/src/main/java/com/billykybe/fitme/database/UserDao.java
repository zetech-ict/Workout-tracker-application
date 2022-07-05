package com.billykybe.fitme.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
@Query("SELECT * FROM useraccount")
    List<UserAccount> getAllUsers();


    @Insert
    void  insertUser(UserAccount ... users);
    @Delete
    void delete(UserAccount user);

}
