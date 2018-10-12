package com.android.lab3


import android.app.Application
import android.arch.persistence.room.Room

abstract class App : Application() {

    lateinit var database: Database

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(applicationContext,
                Database::class.java,
                "ProjectDatabase")
                .fallbackToDestructiveMigration()
                .build()
    }

    //private var instance: App? = null

   /* private var database: Database? = null

    override fun onCreate() {
        super.onCreate()
        instance = this
        database = Room.databaseBuilder(this, Database::class.java!!, "database")
                .build()
    }

    *//*fun getInstance(): App {
        return instance
    }*//*

    fun getDatabase(): Database? {
        return database
    }
*/
}
