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

class Standings2014Activity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.standings2014)
        val arrayAdapter : ArrayAdapter<*>
        val users = arrayOf(
            "Team          W     L     Pct      GB     Conf     Home     ",
            "1.  Pacers    56    26    .683     -      38-14    35-6     ",
            "2.  Heat      54    28    .659     2.0    34-18    32-9     ",
            "3.  Raptors   48    34    .585     8.0    32-20    26-15    ",
            "4.  Bulls     48    34    .585     8.0    35-17    27-14    ",
            "5.  Wizards   44    38    .537     12.0   33-19    22-19    ",
            "6.  Nets      44    38    .537     12.0   26-26    28-13    ",
            "7.  Hornets   43    39    .524     13.0   30-22    25-16    ",
            "8.  Hawks     38    44    .463     18.0   28-24    24-17    ",
            "9.  Knicks    37    45    .451     19.0   26-26    19=22    ",
            "10. Cavaliers 33    49    .402     23.0   21-31    19-22    ",
            "11. Piston    29    53    .354     27.0   23-29    17-24    ",
            "12. Celtics   25    57    .305     31.0   21-31    16-25    ",
            "13. Magic     23    59    .280     33.0   17-35    19-22    ",
            "14. 76ers     19    63    .232     37.0   14-38    10-31    ",
            "15. Bucks     15    67    .183     41.0   12-40    10-31    "
        )

        var mListview = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListview.adapter = arrayAdapter
        bk20.setOnClickListener(){
            startActivity(Intent(this, eastselector::class.java))
        }

    }

}