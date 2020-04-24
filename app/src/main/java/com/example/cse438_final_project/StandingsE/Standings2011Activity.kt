package com.example.cse438_final_project.StandingsE

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.cse438_final_project.Activity.MainPageActivity
import com.example.cse438_final_project.R
import com.example.cse438_final_project.RankingsInterface.eastselector
import kotlinx.android.synthetic.main.standings2019.*

class Standings2011Activity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.standings2011)
        val arrayAdapter : ArrayAdapter<*>
        val users = arrayOf(
            "Team          W     L     Pct      GB     Conf     Home     ",
            "1.  Bulls     62    20    .756     -      39-13    36-5     ",
            "2.  Heat      58    24    .707     4.0    38-14    30-11    ",
            "3.  Celtics   56    26    .683     6.0    37-15    33-8     ",
            "4.  Magic     52    30    .634     10.0   36-16    29-12    ",
            "5.  Hawks     44    38    .537     18.0   31-21    24-17    ",
            "6.  Knicks    42    40    .512     20.0   28-24    23-18    ",
            "7.  76ers     41    41    .500     21.0   25-27    26-15    ",
            "8.  Pacers    37    45    .451     25.0   28-24    24-17    ",
            "9.  Bucks     35    47    .427     27.0   26-26    22-19    ",
            "10. Hornets   34    48    .415     28.0   22-30    21-20    ",
            "11. Pistons   30    52    .366     32.0   22-30    21-20    ",
            "12. Nets      24    58    .293     38.0   13-39    19-22    ",
            "13. Wizards   23    59    .280     39.0   16-36    20-21    ",
            "14. Raptors   22    60    .268     40.0   14-38    16-25    ",
            "15. Cavaliers 19    63    .232     43.0   15-37    12-29    "
        )
        var mListview = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListview.adapter = arrayAdapter
        bk20.setOnClickListener(){
            startActivity(Intent(this, eastselector::class.java))
        }

    }

}