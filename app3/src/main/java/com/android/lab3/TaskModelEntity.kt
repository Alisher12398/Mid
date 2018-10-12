package com.android.lab3

import android.arch.persistence.room.*

//@Entity(foreignKeys = arrayOf(ForeignKey(entity = Company::class, parentColumns = arrayOf("id"))))
@Entity(tableName = "todo_tasks")
data class TaskModelEntity(

        @PrimaryKey(autoGenerate = true)
        var id: Long,

        @ColumnInfo(name = "task_title")
        var title: String,

        @ColumnInfo
        var subtitle: String

)