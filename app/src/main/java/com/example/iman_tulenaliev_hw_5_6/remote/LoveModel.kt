package com.example.iman_tulenaliev_hw_5_6.remote

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "love_table")
data class LoveModel (
    @SerializedName("fname")
    var fname: String,
    var sname: String,
    var percentage: String,
    var result: String,
    @PrimaryKey(autoGenerate = true)
    var id: Int
) : java.io.Serializable