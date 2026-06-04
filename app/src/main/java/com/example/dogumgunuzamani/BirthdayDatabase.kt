package com.example.dogumgunuzamani

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [BirthdayEntity::class], version = 1)
abstract class BirthdayDatabase : RoomDatabase() {
    abstract fun birthdayDao(): BirthdayDao
}
