package com.example.myapplication.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.myapplication.entity.User

@Dao
interface UserDao {

    @Query("select * from user")
    fun getAllUsers(): List<User>

    @Insert
    fun addUser(user: User)

    @Delete
    fun deleteUser(user: User)

    @Query("select * from user where user_id = :id")
    fun getUserById(id: Int): User?

    @Query("select * from user " +
            "where login =:login and password =:password")
    fun login(login: String, password: String): User?

}