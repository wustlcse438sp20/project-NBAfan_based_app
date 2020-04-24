package com.example.cse438_final_project.StandingsW

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.cse438_final_project.R
import com.example.cse438_final_project.RankingsInterface.westselector
import kotlinx.android.synthetic.main.standings2019.*

class wst2012: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wst2012)
        val arrayAdapter : ArrayAdapter<*>
        val users = arrayOf(
            "Team          W     L     Pct      GB     Conf     Home     ",
            "1.  Spurs     50    16    .758     -      35-13    28-5     ",
            "2.  Thunder   47    19    .712     3.0    34-14    26-7     ",
            "3.  Lakers    41    25    .621     9.0    32-16    26-7     ",
            "4.  Grizzlies 41    25    .621     9.0    26-22    26-7     ",
            "5.  Clippers  40    26    .606     10.0   29-19    24-9     ",
            "6.  Nuggets   38    28    .576     12.0   22-26    20-13    ",
            "7.  Mavericks 36    30    .545     14.0   26-22    23-10    ",
            "8.  Jazz      36    30    .545     14.0   25-23    25-8     ",
            "9.  Rockets   34    32    .515     16.0   23-25    22-11    ",
            "10. Suns      33    33    .500     17.0   23-25    19-14    ",
            "11. Trail B   28    38    .424     22.0   20-28    20-13    ",
            "12. Tbrwolves 26    40    .394     24.0   19-29    13-20    ",
            "13. Warriors  23    43    .348     27.0   16-32    12-21    ",
            "14. Kings     22    44    .333     28.0   16-32    16-17    ",
            "15. Hornets   21    45    .318     29.0   14-34    11-22    "
        )
        var mListview = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListview.adapter = arrayAdapter
        bk20.setOnClickListener(){
            startActivity(Intent(this, westselector::class.java))
        }

    }
}