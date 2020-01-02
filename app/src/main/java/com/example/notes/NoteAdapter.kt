package com.example.notes
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NoteAdapter(var notes: List<MyNote>):RecyclerView.Adapter<NoteAdapter.ViewHolder>() {


    override fun onCreateViewHolder(p: ViewGroup, viewType: Int): ViewHolder {
        val view= LayoutInflater.from(p.context).inflate(R.layout.list_layout,p,false)
        return ViewHolder(view)


    }

    override fun onBindViewHolder(p: ViewHolder, position: Int) {
        p.note1.text=notes[position].note1
        p.des1.text=notes[position].des1
    }

    override fun getItemCount(): Int {
        return notes.size
    }
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val note1= itemView.findViewById(R.id.textViewNote) as TextView
        val des1 = itemView.findViewById(R.id.textViewDes) as TextView
 }

}