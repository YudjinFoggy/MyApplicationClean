package com.example.shared.data.db.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.shared.data.db.dao.BoredDao
import com.example.shared.data.db.entity.BoredEntity

@Database(entities = [BoredEntity::class], version = 1)
abstract class MainDataBase : RoomDatabase() {
    abstract fun boredDao(): BoredDao

    companion object {
        private var Instance: MainDataBase? = null

        fun provideDb(context: Context): MainDataBase {
            if (Instance != null) return Instance as MainDataBase
            else {
                Instance =
                    Room.databaseBuilder(context, MainDataBase::class.java, "database").build()
                return Instance as MainDataBase
            }
        }
    }
}