package com.example.notes

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
@Dao
interface NotesDao {

    @Insert
    fun insertAll(mynotes:MyNote)

    @Query( "SELECT * FROM MyNote")
    fun getAll():List<MyNote>
}