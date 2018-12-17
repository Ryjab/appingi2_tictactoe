package fr.epita.android.tictactoe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activity_main_image_tictactoe.setImageDrawable(resources.getDrawable(R.drawable.tictactoe))
        activity_main_image_epita.setImageDrawable(resources.getDrawable(R.drawable.img_epita))


        fun onClick(name : String) : Intent
        {
            return Intent(this@MainActivity, Game::class.java).apply {
                putExtra("Name", name)}
        }

        activity_main_button_start.setOnClickListener {
            val name : String = activity_main_name.text.toString()
            Toast.makeText(this@MainActivity, name, Toast.LENGTH_SHORT).show()
            startActivity(onClick(name))
        }

    }
}
