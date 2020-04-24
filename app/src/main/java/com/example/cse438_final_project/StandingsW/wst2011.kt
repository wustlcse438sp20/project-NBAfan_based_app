package com.example.cse438_final_project.StandingsW

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.cse438_final_project.R
import com.example.cse438_final_project.RankingsInterface.westselector
import kotlinx.android.synthetic.main.standings2019.*

class wst2011: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wst2011)
        val arrayAdapter : ArrayAdapter<*>
        val users = arrayOf(
            "Team          W     L     Pct      GB     Conf     Home     ",
            "1.  Spurs     61    21    .744     -      38-14    36-5     ",
            "2.  Lakers    57    25    .695     4.0    36-16    30-11    ",
            "3.  Mavericks 57    25    .695     4.0    35-17    29-12    ",
            "4.  Thunder   55    27    .671     6.0    33-19    30-11    ",
            "5.  Nuggest   50    32    .610     11.0   30-22    33-8     ",
            "6.  Trail B   48    34    .585     13.0   30-22    30-11    ",
            "7.  Hornets   46    36    .561     15.0   27-25    28-13    ",
            "8.  Grizzlies 46    36    .561     15.0   30-22    30-11    ",
            "9.  Rockets   43    39    .524     18.0   25-27    25-16    ",
            "10. Suns      40    42    .488     21.0   23-29    23-18    ",
            "11. Jazz      39    43    .476     22.0   21-31    21-20    ",
            "12. Warriors  36    46    .439     25.0   21-31    26-15    ",
            "13. Clippers  32    50    .390     29.0   19-33    23-18    ",
            "14. Kings     24    58    .293     37.0   15-37    11-30    ",
            "15. Tbrwolves 17    65    .207     44.0   7-45     12-29    "
        )
        var mListview = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListview.adapter = arrayAdapter
        bk20.setOnClickListener(){
            startActivity(Intent(this, westselector::class.java))
        }

    }
}