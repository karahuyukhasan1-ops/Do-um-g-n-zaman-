package com.example.dogumgunuzamani

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BirthdayDao {
    @Insert
    suspend fun insert(birthday: BirthdayEntity)

    @Delete
    suspend fun delete(birthday: BirthdayEntity)

    @Query("SELECT * FROM birthdays ORDER BY month, day")
    fun getAllBirthdays(): Flow<List<BirthdayEntity>>

    @Query("SELECT * FROM birthdays WHERE month = :month AND day = :day")
    suspend fun getBirthdaysByDate(month: Int, day: Int): List<BirthdayEntity>

    @Query("SELECT COUNT(*) FROM birthdays")
    fun getBirthdayCount(): Flow<Int>
}
