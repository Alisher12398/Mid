package com.android.lab3

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase


@Database(entities = arrayOf(User::class), version = 1)
abstract class Database : RoomDatabase(){

    //abstract fun taskdao(): TaskModelDAO
    abstract fun userdao(): UserDAO

}