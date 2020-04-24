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

class Standings2016Activity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.standings2016)
        val arrayAdapter : ArrayAdapter<*>
        val users = arrayOf(
            "Team          W     L     Pct      GB     Conf     Home     ",
            "1.  Cavaliers 57    25    .695     -      35-17    33-8     ",
            "2.  Raptors   56    26    .683     1.0    39-13    32-9     ",
            "3.  Heat      48    34    .585     9.0    31-21    28-13    ",
            "4.  Hawks     48    34    .585     9.0    29-23    27-14    ",
            "5.  Celtics   48    34    .585     9.0    31-21    28-13    ",
            "6.  Hornets   48    34    .585     9.0    33-19    30-11    ",
            "7.  Pacers    45    37    .549     12.0   30-22    26-15    ",
            "8.  Piston    44    38    .537     13.0   29-23    26-15    ",
            "9.  Bulls     42    40    .512     15.0   25-27    26-15    ",
            "10. Wizards   41    41    .500     16.0   30-22    22-19    ",
            "11. Magic     35    47    .427     22.0   21-31    23-18    ",
            "12. Bucks     33    49    .402     24.0   21-31    23-18    ",
            "13. knicks    32    50    .390     25.0   21-31    18-23    ",
            "14. Nets      21    61    .256     36.0   12-40    14-27    ",
            "15. 76ers     10    72    .122     47.0   3-49     7-34     "
        )

        var mListview = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListview.adapter = arrayAdapter
        bk20.setOnClickListener(){
            startActivity(Intent(this, eastselector::class.java))
        }

    }

}