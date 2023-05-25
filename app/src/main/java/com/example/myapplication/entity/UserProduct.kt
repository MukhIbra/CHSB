package com.example.myapplication.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "UserProducts",
    primaryKeys = ["userId", "productId"],
    foreignKeys = [
        ForeignKey(entity = User::class, parentColumns = ["user_id"], childColumns = ["user_id"]),
        ForeignKey(
            entity = Product::class,
            parentColumns = ["product_id"],
            childColumns = ["product_id"]
        )
    ]
)
data class UserProduct(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    val user_id: Int,
    val product_id: Int

)