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

class Standings2013Activity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.standings2013)
        val arrayAdapter : ArrayAdapter<*>
        val users = arrayOf(
            "Team          W     L     Pct      GB     Conf     Home     ",
            "1.  Heat      66    16    .805     -      41-11    37-4     ",
            "2.  Knicks    54    28    .659     12.0   37-15    31-10    ",
            "3.  Pacers    49    32    .605     16.5   31-20    30-11    ",
            "4.  Nets      49    33    .598     17.0   36-16    26-15    ",
            "5.  Bulls     45    37    .549     21.0   34-18    24-17    ",
            "6.  Hawks     44    38    .537     22.0   29-23    25-16    ",
            "7.  Celtics   41    40    .506     24.5   27-24    27-13    ",
            "8.  Bucks     38    44    .463     28.0   24-28    21-20    ",
            "9.  76ers     34    48    .415     32.0   22-30    23-18    ",
            "10. Raptors   34    48    .415     32.0   22-30    21-20    ",
            "11. Piston    29    53    .354     37.0   25-27    18-23    ",
            "12. Wizards   29    53    .354     37.0   15=37    22-19    ",
            "13. Cavaliers 24    58    .293     42.0   18-34    14-27    ",
            "14. Hornets   21    61    .256     45.0   18-34    15-26    ",
            "15. Magic     20    62    .244     46.0   10-42    12-29    "
        )
        var mListview = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListview.adapter = arrayAdapter
        bk20.setOnClickListener(){
            startActivity(Intent(this, eastselector::class.java))
        }

    }

}
