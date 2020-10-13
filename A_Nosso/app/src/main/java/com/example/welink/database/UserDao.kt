package com.example.welink.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface UserDao {

    @Insert
    fun insert(pessoa: User)

    @Update
    fun update(pessoa: User)

    @Query("SELECT * FROM tblUser WHERE userId = :key")
    fun get(key: Long): User

    // Apaga toda fileira
//    @Query("DELETE FROM tblUser")
//    fun clear()

//    @Query("SELECT * FROM tblUser ORDER BY userId DESC")
//    fun getAllUsers(): <List<User>>

    // Retorna o usuário mais recente
//    @Query("SELECT * FROM tblUser ORDER BY userId DESC LIMIT 1")
//    fun getUser(): User?






}