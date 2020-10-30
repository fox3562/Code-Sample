package ru.flatstack.sample.model.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ru.flatstack.sample.entities.SimpleWh

@Dao
interface WhDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(items: List<SimpleWh>)

    @Query("select * from SimpleWh")
    suspend fun getAll(): List<SimpleWh>
}