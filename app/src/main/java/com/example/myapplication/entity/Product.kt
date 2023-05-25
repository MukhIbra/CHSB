package com.example.myapplication.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "products")
data class Product(
    @PrimaryKey(autoGenerate = true) var product_id: Int = 0,
    @ColumnInfo("product_name")
    var productName:String,
    var category: String,
    var price:Int
)