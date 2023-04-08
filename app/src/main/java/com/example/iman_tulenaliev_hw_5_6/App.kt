package com.example.iman_tulenaliev_hw_5_6

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import com.example.iman_tulenaliev_hw_5_6.room.AppDataBase
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    companion object {
        lateinit var appDatabase: AppDataBase
    }

    override fun onCreate() {
        super.onCreate()
        appDatabase = Room.databaseBuilder(applicationContext, AppDataBase::class.java, "love-file")
            .allowMainThreadQueries().build()
    }
}