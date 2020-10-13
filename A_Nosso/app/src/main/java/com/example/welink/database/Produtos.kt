package com.example.welink.database
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tblProdutos")
data class Produtos (
    @PrimaryKey(autoGenerate = true)
    var prodId:Long = 0L,
    @ColumnInfo(name = "prodNome")
    val prodNome:String,
    @ColumnInfo(name = "prodImg")
    val prodImg:String,
    @ColumnInfo(name = "prodQtd")
    val prodQtd:String,
    @ColumnInfo(name = "prodPreco")
    val prodPreco:Double,
    @ColumnInfo(name = "prodCtg")
    val prodCtg:String

)

