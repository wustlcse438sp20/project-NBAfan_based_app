package com.example.cse438_final_project.StandingsW

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.cse438_final_project.R
import com.example.cse438_final_project.RankingsInterface.westselector
import kotlinx.android.synthetic.main.standings2019.*

class wst2016: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wst2012)
        val arrayAdapter : ArrayAdapter<*>
        val users = arrayOf(
            "Team          W     L     Pct      GB     Conf     Home     ",
            "1.  Bucks     66    22    .732     -      40-12    33-8     ",
            "2.  Raptors   58    24    .707     2.0    36-16    32-9     ",
            "3.  76ers     51    31    .622     9.0    31-21    31-10    ",
            "4.  Celtics   49    33    .598     11.0   35-17    28-13    ",
            "5.  Pacers    48    34    .585     12.0   33-19    29-12    ",
            "6.  Nets      42    40    .512     18.0   29-23    25-16    ",
            "7.  Magic     42    40    .512     18.0   30-22    26-15    ",
            "8.  Piston    41    41    .500     19.0   27-25    26-15    ",
            "9.  Hornets   39    43    .476     21.0   29-23    25-16    ",
            "10. Heat      39    43    .476     21.0   23-29    19-22    ",
            "11. Piston    41    41    .500     19.0   27-25    26-15    ",
            "12. Piston    41    41    .500     19.0   27-25    26-15    ",
            "13. Piston    41    41    .500     19.0   27-25    26-15    ",
            "14. Piston    41    41    .500     19.0   27-25    26-15    ",
            "15. Piston    41    41    .500     19.0   27-25    26-15    "
        )
        var mListview = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListview.adapter = arrayAdapter
        bk20.setOnClickListener(){
            startActivity(Intent(this, westselector::class.java))
        }

    }
}