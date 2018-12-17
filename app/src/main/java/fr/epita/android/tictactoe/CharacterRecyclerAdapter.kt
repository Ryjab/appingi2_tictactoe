package fr.epita.android.tictactoe

import android.annotation.SuppressLint
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class CharacterRecyclerAdapter(val data: List<Player>) : RecyclerView.Adapter<CharacterRecyclerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val rowview = LayoutInflater.from(parent.context).inflate(R.layout.raw_character, parent, false)

        return ViewHolder(rowview)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        viewHolder.firstnameTextView.text = data[position].player
        if (data[position].result == 1) {
            viewHolder.aligmentImageView.setImageResource(R.drawable.ic_thumb_down)
        } else if (data[position].result == 2) {
            viewHolder.aligmentImageView.setImageResource(R.drawable.ic_thumb_up)
        }
    }

    class ViewHolder(rowview : View) : RecyclerView.ViewHolder(rowview){
        val firstnameTextView = rowview.findViewById<TextView>(R.id.raw_character_name)
        @SuppressLint("ResourceType")
        val aligmentImageView = rowview.findViewById<ImageView>(R.drawable.ic_thumb_up)
        val date = rowview.findViewById<TextView>(R.id.activity_score_date)
    }

}
