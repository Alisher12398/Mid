package com.android.lab3

import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

interface UserDAO {

    @Insert
    fun insertUser(user: User): Long?


    @Query("SELECT * FROM user_table")
    fun getUsers(): List<User>
}