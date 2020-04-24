package com.example.cse438_final_project.StandingsW

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.cse438_final_project.R
import com.example.cse438_final_project.RankingsInterface.westselector
import kotlinx.android.synthetic.main.standings2019.*

class wst2018: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wst2018)
        val arrayAdapter : ArrayAdapter<*>
        val users = arrayOf(
            "Team          W     L     Pct      GB     Conf     Home     ",
            "1.  Rocekts   66    17    .793     -      41-11    34-7     ",
            "2.  Warriors  58    24    .707     7.0    34-18    29-12     ",
            "3.  Trail B   49    33    .598     16.0   31-21    28-13    ",
            "4.  Thunder   48    34    .585     17.0   28-24    27-14    ",
            "5.  Jazz      48    34    .585     17.0   34-18    28-13    ",
            "6.  Pelicans  48    34    .585     17.0   27-25    24-17    ",
            "7.  Spurs     47    35    .573     18.0   29-23    33-8    ",
            "8.  Tbrwolves 47    35    .573     18.0   34-18    30-11    ",
            "9.  Nuggets   46    36    .561     19.0   28-24    31-10    ",
            "10. Clippers  42    40    .512     23.0   24-28    22-19    ",
            "11. Lakers    35    47    .427     30.0   19-33    20-21    ",
            "12. Kings     27    55    .329     38.0   14-38    14-27    ",
            "13. Mavericks 24    58    .293     41.0   14-38    15-26    ",
            "14. Grizzlies 22    60    .268     43.0   18-34    16-25    ",
            "15. Suns      21    61    .256     44.0   15-37    10-31    "
        )
        var mListview = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListview.adapter = arrayAdapter
        bk20.setOnClickListener(){
            startActivity(Intent(this, westselector::class.java))
        }

    }
}