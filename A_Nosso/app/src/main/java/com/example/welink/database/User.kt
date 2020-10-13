package com.example.welink.database
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tblUser")
data class User (
    @PrimaryKey(autoGenerate = true)
    var userId:Long = 0L,
    @ColumnInfo(name = "user_nome")
    val userNome:String,
    @ColumnInfo(name = "user_email")
    val userEmail:String,
    @ColumnInfo(name = "user_senha")
    val userSenha:String)




