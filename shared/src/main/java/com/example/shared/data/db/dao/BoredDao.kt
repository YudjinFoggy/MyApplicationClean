package com.example.shared.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.shared.data.db.entity.BoredEntity

@Dao
interface BoredDao {

    @Insert
    suspend fun insert(item: BoredEntity)

    @Query("SELECT * FROM bored_table WHERE id=:id")
    suspend fun findItem(id: String): List<BoredEntity>

    @Query("SELECT * FROM bored_table")
    suspend fun loadAll(): List<BoredEntity>
}