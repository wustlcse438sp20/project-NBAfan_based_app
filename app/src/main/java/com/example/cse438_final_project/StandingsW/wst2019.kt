package com.example.cse438_final_project.StandingsW

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.cse438_final_project.R
import com.example.cse438_final_project.RankingsInterface.westselector
import kotlinx.android.synthetic.main.standings2019.*

class wst2019: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wst2019)
        val arrayAdapter : ArrayAdapter<*>
        val users = arrayOf(
            "Team          W     L     Pct      GB     Conf     Home     ",
            "1.  Warriors  57    25    .695     -      35-17    30-11    ",
            "2.  Nuggets   54    28    .659     3.0    34-18    34-7     ",
            "3.  Trail B   53    29    .646     4.0    29-23    32-9    ",
            "4.  Rockets   53    29    .610     4.0    32-20    21-10    ",
            "5.  Jazz      50    32    .598     7.0    30-22    29-12    ",
            "6.  Thunder   49    33    .585     8.0    28-24    27-14    ",
            "7.  Spurs     48    34    .476     9.0    30-22    32-9    ",
            "8.  Clippers  48    34    .451     9.0    28-24    26-15    ",
            "9.  Kings     39    43    .439     18.0   21-31    24-17    ",
            "10. Lakers    37    45    .402     20.0   25-27    22-19    ",
            "11. Tbrwolves 36    46    .402     21.0   22-30    25-16    ",
            "12. Grizzles  33    49    .402     24.0   24-28    21-20    ",
            "13. Pelicans  33    49    .402     24.0   23-29    19-22    ",
            "14. Maverick  33    49    .402     24.0   18-34    24-17    ",
            "15. Suns      19    63    .232     38.0   11-41    12-29    "
        )
        var mListview = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListview.adapter = arrayAdapter
        bk20.setOnClickListener(){
            startActivity(Intent(this, westselector::class.java))
        }

    }
}