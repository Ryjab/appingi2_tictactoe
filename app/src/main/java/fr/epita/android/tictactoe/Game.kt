package fr.epita.android.tictactoe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_game.*

class Game : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        var currentId : Int = 0

        val onClick =  View.OnClickListener{
            val id = it.id
            val button = findViewById<Button>(id)
            if (button.text != "")
            {
                if (currentId == 0) {
                    button.text = "O"
                    currentId = 1;
                }
                else {
                    button.text = "X"
                    currentId = 0
                }
            }
        }

        val name = intent.getStringExtra("Name")
        activity_game_text_joueur.text = "O (" + name +")"

        activity_game_1_1.setOnClickListener { onClick }
        activity_game_1_2.setOnClickListener { onClick }
        activity_game_1_3.setOnClickListener { onClick }
        activity_game_2_1.setOnClickListener { onClick }
        activity_game_2_2.setOnClickListener { onClick }
        activity_game_2_3.setOnClickListener { onClick }
        activity_game_3_1.setOnClickListener { onClick }
        activity_game_3_2.setOnClickListener { onClick }
        activity_game_3_3.setOnClickListener { onClick }

    }
}
