package com.bignerdranch.android.criminalintent.database

import androidx.room.Database
import androidx.room.DatabaseConfiguration
import androidx.room.InvalidationTracker
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteOpenHelper
import com.bignerdranch.android.criminalintent.Crime

    @Database(entities = [Crime::class], version = 1)
    @TypeConverters(CrimeTypeConvertor::class)
    abstract class CrimeDatabase : RoomDatabase() {
        abstract fun crimeDao(): CrimeDao



}