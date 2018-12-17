package fr.epita.android.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import fr.epita.android.tictactoe.R.layout.activity_score
import kotlinx.android.synthetic.main.activity_score.*

class Score : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)


        val data = ArrayList<Player>()
        /*val baseURL = "http://www.onzeweb.net/api/scores.json"
        val jsonConverter = GsonConverterFactory.create(GsonBuilder().create())
        val retrofit = Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(jsonConverter)
            .build()

        val service = retrofit.create(WebServiceInterface::class.java)*/

         recycler_view.adapter = CharacterRecyclerAdapter(data)
        recycler_view.layoutManager = LinearLayoutManager(this@Score, LinearLayoutManager.VERTICAL, false)

    }
}
