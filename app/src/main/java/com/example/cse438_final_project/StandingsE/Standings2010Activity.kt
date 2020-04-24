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

class Standings2010Activity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.standings2010)
        val arrayAdapter : ArrayAdapter<*>
        val users = arrayOf(
            "Team          W     L     Pct      GB     Conf     Home     ",
            "1.  Cavaliers 61    21    .744     -      38-14    35-6     ",
            "2.  Magic     59    23    .720     2.0    39-13    34-7     ",
            "3.  Hawks     53    29    .646     8.0    32-20    34-7    ",
            "4.  Celtics   50    32    .610     11.0   33-19    24-17    ",
            "5.  Heat      47    35    .573     14.0   32-20    24-17    ",
            "6.  Bucks     46    36    .561     15.0   31-21    28-13    ",
            "7.  Hornets   44    38    .537     17.0   27-25    31-10    ",
            "8.  Bulls     41    41    .500     20.0   28-24    24-17    ",
            "9.  Raptors   40    42    .488     21.0   29-23    25-16    ",
            "10. Pacers    32    50    .390     29.0   23-29    23-18    ",
            "11. Knicks    29    53    .354     32.0   20-32    18-23    ",
            "12. Pistons   27    55    .329     34.0   18-34    17-24    ",
            "13. 76ers     27    55    .329     34.0   14-38    12-29    ",
            "14. Wizards   26    56    .317     35.0   18-34    15-26    ",
            "15. Nets      12    70    .146     49.0   8-44     8-33     "
        )
        var mListview = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListview.adapter = arrayAdapter
        bk20.setOnClickListener(){
            startActivity(Intent(this, eastselector::class.java))
        }

    }

}