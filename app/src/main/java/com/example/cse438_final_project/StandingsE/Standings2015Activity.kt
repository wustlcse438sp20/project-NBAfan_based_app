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

class Standings2015Activity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.standings2015)
        val arrayAdapter : ArrayAdapter<*>
        val users = arrayOf(
            "Team          W     L     Pct      GB     Conf     Home     ",
            "1.  Hawks     60    22    .732     -      38-14    35-6     ",
            "2.  Cavaliers 53    29    .646     7.0    35-17    32-10    ",
            "3.  Bulls     50    32    .610     10.0   33-19    27-14    ",
            "4.  Raptors   49    33    .598     11.0   33-19    27-14    ",
            "5.  Wizards   46    36    .561     14.0   30-22    29-12    ",
            "6.  Bucks     41    41    .500     19.0   30-22    23-18    ",
            "7.  Celtics   40    42    .488     20.0   28-24    21-20    ",
            "8.  Nets      38    44    .463     22.0   24-28    19-22    ",
            "9.  Pacers    38    44    .463     22.0   28-24    23-18    ",
            "10. Heat      37    45    .451     23.0   25-27    20-21    ",
            "11. Hornets   33    49    .402     27.0   25-27    19-22    ",
            "12. Piston    32    50    .390     28.0   23-29    18-23    ",
            "13. Magic     25    57    .305     35.0   15-37    13-28    ",
            "14. 76ers     18    64    .220     42.0   12-40    12-29    ",
            "15. Knicks    17    65    .207     43.0   11-41    10-31    ")
        var mListview = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListview.adapter = arrayAdapter
        bk20.setOnClickListener(){
            startActivity(Intent(this, eastselector::class.java))
        }

    }

}
