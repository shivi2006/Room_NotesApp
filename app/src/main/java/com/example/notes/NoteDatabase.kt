package com.example.notes

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [MyNote::class],
    version = 1,
    exportSchema=false
)

abstract class NoteDatabase : RoomDatabase() {

    abstract fun getnotesDao(): NotesDao

}