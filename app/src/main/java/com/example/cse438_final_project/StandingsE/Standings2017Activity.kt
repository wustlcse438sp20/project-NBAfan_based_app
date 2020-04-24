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

class Standings2017Activity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.standings2017)
        val arrayAdapter : ArrayAdapter<*>
        val users = arrayOf(
            "Team          W     L     Pct      GB     Conf     Home     ",
            "1.  Celtics   53    29    .646     -      36-16    30-11     ",
            "2.  Cavaliers 51    31    .622     2.0    35-17    31-10    ",
            "3.  Raptors   51    31    .622     2.0    34-18    28-13    ",
            "4.  Wizards   49    33    .598     4.0    32-20    30-11    ",
            "5.  Hawks     43    39    .524     10.0   30-22    23-18    ",
            "6.  Bucks     42    40    .512     11.0   27-25    23-18    ",
            "7.  Pacers    42    40    .512     11.0   26-26    29-12    ",
            "8.  Bulls     41    41    .500     12.0   28-24    25-16    ",
            "9.  Heat      41    41    .500     12.0   27-25    23-18    ",
            "10. Pistons   37    45    .451     16.0   21-31    24-17    ",
            "11. Hornets   46    46    .439     17.0   22-30    22-19    ",
            "12. Knicks    31    51    .378     22.0   22-30    19-22    ",
            "13. Magic     29    53    .354     24.0   20-32    16-25    ",
            "14. 76ers     28    54    .341     25.0   19-33    17-24    ",
            "15. Nets      20    62    .244     33.0   11-41    13-28    "
        )
        var mListview = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListview.adapter = arrayAdapter
        bk20.setOnClickListener(){
            startActivity(Intent(this, eastselector::class.java))
        }

    }

}
