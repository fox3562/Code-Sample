package ru.flatstack.sample.model.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.flatstack.sample.entities.SimpleWh
import ru.flatstack.sample.model.data.db.dao.WhDao

@Database(entities = [(SimpleWh::class)], version = 1, exportSchema = false)
abstract class RoomDB : RoomDatabase() {

    abstract fun whDao(): WhDao
}