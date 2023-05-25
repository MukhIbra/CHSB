package com.example.myapplication

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myapplication.dao.*
import com.example.myapplication.entity.*


@Database(
    entities = [User::class, Product::class, UserProduct::class],
    version = 1,
)
abstract class AppDataBase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun productDao(): ProductDao
    abstract fun userProductDao(): UserProductDao

    companion object {
        private const val DATABASE_NAME = "app_database"

        private var instanse: AppDataBase? = null

        fun getInstance(context: Context): AppDataBase {
            if (instanse== null){
                instanse = Room.databaseBuilder(context,AppDataBase::class.java,"app_db")
                    .allowMainThreadQueries()
                    .build()
            }
            return instanse!!
        }
    }
}