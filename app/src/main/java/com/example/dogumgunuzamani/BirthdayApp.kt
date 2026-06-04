package com.example.dogumgunuzamani

import android.app.Application
import androidx.room.Room

class BirthdayApp : Application() {
    companion object {
        lateinit var database: BirthdayDatabase
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            this,
            BirthdayDatabase::class.java,
            "birthday_db"
        ).build()
    }
}
