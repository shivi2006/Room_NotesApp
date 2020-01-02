package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val db: NoteDatabase = Room.databaseBuilder(applicationContext,
            NoteDatabase::class.java,
            "note_database").allowMainThreadQueries().build()
        val notes: List<MyNote> = db.getnotesDao().getAll()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val adapter = NoteAdapter(notes)
        recyclerView.adapter = adapter


        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener(object : View.OnClickListener{
            override fun onClick(view:View?) {

                val intent= Intent(this@MainActivity, New_Note::class.java)
                startActivity(intent)

    }

        }

        )
    }
}
