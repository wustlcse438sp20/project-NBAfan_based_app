package com.example.cse438_final_project.StandingsW

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.cse438_final_project.Activity.MainPageActivity
import com.example.cse438_final_project.R
import com.example.cse438_final_project.RankingsInterface.westselector
import kotlinx.android.synthetic.main.standings2019.*

class wst2010 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.standings2010)
        val arrayAdapter : ArrayAdapter<*>
        val users = arrayOf(
            "Team          W     L     Pct      GB     Conf     Home     ",
            "1.  Lakers    57    25    .695     -      35-17    34-7     ",
            "2.  Mavericks 55    27    .671     2.0    33-19    28-13    ",
            "3.  Suns      54    28    .659     3.0    35-17    32-9     ",
            "4.  Nuggets   53    29    .646     4.0    34-18    34-7     ",
            "5.  Jazz      53    29    .646     4.0    31-21    32-9     ",
            "6.  Trail B   50    32    .610     7.0    33-19    26-16    ",
            "7.  Spurs     50    32    .610     7.0    31-21    29-12    ",
            "8.  Thunder   50    32    .610     7.0    28-24    27-14    ",
            "9.  Rockets   42    40    .512     15.0   28-24    23-18    ",
            "10. Grizzlies 40    42    .488     17.0   22-30    23-18    ",
            "11. Hornets   37    45    .451     20.0   26-26    24-17    ",
            "12. Clippers  29    53    .354     28.0   15-37    21-20    ",
            "13. Warriors  26    56    .317     31.0   15-37    18-23    ",
            "14. Kings     25    57    .305     32.0   16-36    18-23    ",
            "15. Tbrwolves 15    67    .183     42.0   8-44     10-31     "
        )
        var mListview = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListview.adapter = arrayAdapter
        bk20.setOnClickListener(){
            startActivity(Intent(this, westselector::class.java))
        }

    }

}