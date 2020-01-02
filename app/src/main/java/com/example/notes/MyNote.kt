package com.example.notes

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
class MyNote (

    var note1: String,
    var des1: String)
{
    @PrimaryKey(autoGenerate = true)
    var id:Int?=null
}
