package com.example.notes

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import kotlinx.android.synthetic.main.new_note.*

class New_Note: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_note)

        val title = findViewById<EditText>(R.id.noteTitle)
        val  des = findViewById<EditText>(R.id.noteDes)
        val button = findViewById<Button>(R.id.button_save)

        val db: NoteDatabase = Room.databaseBuilder(applicationContext,
            NoteDatabase::class.java,
            "note_database").allowMainThreadQueries().build()


        button.setOnClickListener(object : View.OnClickListener{
            override fun onClick(view: View?) {

                val notes=MyNote(title.text.toString(),des.text.toString())
                db.getnotesDao().insertAll(notes)
                startActivity(Intent(this@New_Note,MainActivity::class.java))

            }})
    }
}