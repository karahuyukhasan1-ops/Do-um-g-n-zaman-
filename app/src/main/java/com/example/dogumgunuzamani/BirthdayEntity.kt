package com.example.dogumgunuzamani

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "birthdays")
data class BirthdayEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val month: Int,  // 1-12
    val day: Int     // 1-31
)
