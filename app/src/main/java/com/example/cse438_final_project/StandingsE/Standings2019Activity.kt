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

class Standings2019Activity:AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.standings2019)
        val arrayAdapter : ArrayAdapter<*>
        val users = arrayOf(
            "Team          W     L     Pct      GB     Conf     Home     ",
            "1.  Bucks     66    22    .732     -      40-12    33-8     ",
            "2.  Raptors   58    24    .707     2.0    36-16    32-9     ",
            "3.  76ers     51    31    .622     9.0    31-21    31-10    ",
            "4.  Celtics   49    33    .598     11.0   35-17    28-13    ",
            "5.  Pacers    48    34    .585     12.0   33-19    29-12    ",
            "6.  Nets      42    40    .512     18.0   29-23    25-16    ",
            "7.  Magic     42    40    .512     18.0   30-22    26-15    ",
            "8.  Piston    41    41    .500     19.0   27-25    26-15    ",
            "9.  Hornets   39    43    .476     21.0   29-23    25-16    ",
            "10. Heat      39    43    .476     21.0   23-29    19-22    ",
            "11. Wizards   32    50    .390     28.0   19-33    22-19    ",
            "12. Hawks     29    53    .354     31.0   16-36    17-24    ",
            "13. Bulls     22    60    .268     38.0   16-36    9 -32    ",
            "14. Cavaliers 19    63    .232     41.0   15-37    13-28    ",
            "15. Knicks    17    65    .207     43.0   11-41    9 -32    "
             )
        var mListview = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListview.adapter = arrayAdapter
        bk20.setOnClickListener(){
            startActivity(Intent(this, eastselector::class.java))
        }

    }

}