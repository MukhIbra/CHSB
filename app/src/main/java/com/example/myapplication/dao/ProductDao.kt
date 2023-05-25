package com.example.myapplication.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.myapplication.entity.Product
import com.example.myapplication.entity.User

@Dao
interface ProductDao {

    @Query("select * from products")
    fun getAllProducts(): List<Product>

    @Insert
    fun addProduct(product: Product)

    @Delete
    fun deleteProduct(product: Product)

    @Query("select * from products where product_id = :id")
    fun getProductById(id: Int): Product?

    @Query("select * from products ORDER BY category ASC")
    fun getProductsByCategory(): List<Product>

    @Query("select * from products ORDER BY price ASC")
    fun getProductsByPrice(): List<Product>

    @Query("select * from products where product_id = :id")
    fun getUserProducts(user: User): List<Product>
}