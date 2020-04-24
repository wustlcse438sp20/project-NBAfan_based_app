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

class Standings2012Activity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.standings2012)
        val arrayAdapter : ArrayAdapter<*>
        val users = arrayOf(
            "Team          W     L     Pct      GB     Conf     Home     ",
            "1.  Bulls     50    16    .758     -      38-10    26-7     ",
            "2.  Heat      46    20    .697     4.0    35-13    28-5     ",
            "3.  Pacers    42    24    .636     8.0    29-19    23-10    ",
            "4.  Celtics   39    27    .591     11.0   32-16    24-9     ",
            "5.  Hawks     40    26    .606     10.0   31-17    23-10    ",
            "6.  Magic     37    29    .561     13.0   30-18    21-12    ",
            "7.  Knicks    36    30    .545     14.0   28-20    22-11    ",
            "8.  76ers     35    31    .530     15.0   28-20    19-14    ",
            "9.  Bucks     31    35    .470     19.0   24-24    17-16    ",
            "10. Pistons   25    41    .379     25.0   20-28    18-15    ",
            "11. Raptors   23    43    .348     27.0   15-33    13-20    ",
            "12. Nets      22    44    .333     28.0   16-32    9-24     ",
            "13. Cavaliers 21    45    .318     29.0   13-35    11-22    ",
            "14. Wizards   20    46    .303     30.0   16-32    11-22    ",
            "15. Hornets   7     59    .106     43.0   5-43     4-29     "
        )
        var mListview = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListview.adapter = arrayAdapter
        bk20.setOnClickListener(){
            startActivity(Intent(this, eastselector::class.java))
        }

    }

}
