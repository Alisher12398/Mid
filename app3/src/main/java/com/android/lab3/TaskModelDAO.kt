package com.android.lab3

import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

interface TaskModelDAO {

    @Insert
    fun insertTask(task: TaskModelEntity): Long?


    @Query("SELECT * FROM todo_tasks")
    fun getTasks(): List<TaskModelEntity>
}