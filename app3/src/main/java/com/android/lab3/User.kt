package com.android.lab3

import android.arch.persistence.room.*

//@Entity(foreignKeys = arrayOf(ForeignKey(entity = Company::class, parentColumns = arrayOf("id"))))
@Entity(tableName = "user_table")
data class User(

        @PrimaryKey(autoGenerate = true)
        var id: Long,

        @ColumnInfo(name = "user_name")
        var name: String,

        @ColumnInfo
        var password: String

)