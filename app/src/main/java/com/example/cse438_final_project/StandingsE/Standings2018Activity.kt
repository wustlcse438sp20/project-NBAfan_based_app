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

class Standings2018Activity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.standings2018)
        val arrayAdapter : ArrayAdapter<*>
        val users = arrayOf(
            "Team          W     L     Pct      GB     Conf     Home     ",
            "1.  Raptors   39    23    .720     -      40-12    34-7     ",
            "2.  Celtics   55    27    .671     4.0    33-19    37-14    ",
            "3.  76ers     52    30    .634     7.0    34-18    30-10    ",
            "4.  Cavaliers 50    32    .610     9.0    35-17    29-12    ",
            "5.  Pacers    48    34    .585     11.0   32-20    27-14    ",
            "6.  Heat      44    38    .537     15.0   31-21    26-15    ",
            "7.  Bucks     44    38    .537     15.0   27-25    25-16    ",
            "8.  Wizards   43    39    .524     16.0   28-24    23-18    ",
            "9.  Pistons   39    43    .476     20.0   24-28    25-16    ",
            "10. Hornets   36    46    .439     23.0   22-30    21-20    ",
            "11. Knicks    29    53    .354     30.0   17-35    19-22    ",
            "12. Nets      28    54    .341     31.0   19-33    15-26    ",
            "13. Bulls     27    55    .329     32.0   21-31    17-24    ",
            "14. Magic     25    57    .305     34.0   15-37    17-24    ",
            "15. Hawks     24    58    .293     35.0   12-40    16-25    "
        )
        var mListview = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListview.adapter = arrayAdapter
        bk20.setOnClickListener(){
            startActivity(Intent(this, eastselector::class.java))
        }

    }

}