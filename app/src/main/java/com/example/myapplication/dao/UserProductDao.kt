package com.example.myapplication.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myapplication.entity.Product
import com.example.myapplication.entity.User
import com.example.myapplication.entity.UserProduct

@Dao
interface UserProductDao {
    @Query("""
        SELECT * FROM users 
        INNER JOIN UserProducts ON users.user_id = UserProducts.user_id 
        WHERE UserProducts.product_id = :product_id
    """)
    fun getUsersForProduct(productId: Int): List<User>

    @Query("""
        SELECT * FROM products 
        INNER JOIN UserProducts ON products.product_id = UserProducts.product_id 
        WHERE UserProducts.user_id = :user_id
    """)
    fun getProductsForUser(user_id: Int): List<Product>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUserProduct(userProduct: UserProduct)
}