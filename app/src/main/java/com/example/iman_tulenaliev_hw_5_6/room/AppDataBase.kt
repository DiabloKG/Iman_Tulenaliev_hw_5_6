package com.example.iman_tulenaliev_hw_5_6.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.iman_tulenaliev_hw_5_6.remote.LoveModel
@Database(entities = [LoveModel::class], version = 1)
abstract class AppDataBase : RoomDatabase(){

abstract fun loveDao():LoveDao

}