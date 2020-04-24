package com.example.cse438_final_project.StandingsW

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.cse438_final_project.R
import com.example.cse438_final_project.RankingsInterface.westselector
import kotlinx.android.synthetic.main.standings2019.*

class wst2013: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wst2013)
        val arrayAdapter : ArrayAdapter<*>
        val users = arrayOf(
            "Team          W     L     Pct      GB     Conf     Home     ",
            "1.  Thunder   60    22    .732     -      39-13    34-7     ",
            "2.  Spurs     58    24    .707     2.0    33-19    35-6     ",
            "3.  Nuggets   57    25    .695     3.0    38-14    38-3     ",
            "4.  Clippers  56    26    .683     4.0    35-17    32-9     ",
            "5.  Grizzlies 56    26    .683     4.0    34-18    32-9     ",
            "6.  Warriors  47    35    .573     13.0   28-24    28-13    ",
            "7.  Lakers    45    37    .549     15.0   28-24    29-12    ",
            "8.  Rockets   45    37    .549     15.0   24-28    29-12    ",
            "9.  Jazz      43    39    .524     17.0   26-26    30-11    ",
            "10. Mavericks 41    41    .500     19.0   24-28    24-17    ",
            "11. Trial B   33    49    .402     27.0   18-34    22-19    ",
            "12. Tbrwolves 31    51    .378     29.0   17-35    20-21    ",
            "13. Kings     28    54    .341     32.0   14-38    20-21    ",
            "14. Hornets   27    55    .329     33.0   15-37    16-25    ",
            "15. Suns      25    57    .305     35.0   17-35    17-24    "
        )
        var mListview = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListview.adapter = arrayAdapter
        bk20.setOnClickListener(){
            startActivity(Intent(this, westselector::class.java))
        }

    }
}