package com.example.myapplication.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User (
    @PrimaryKey(autoGenerate = true) var user_id: Int = 0,
    @ColumnInfo("user_name")
    var userName:String,
    var login:String,
    var password:String,
    var status:Boolean = true,
    var role:String
)