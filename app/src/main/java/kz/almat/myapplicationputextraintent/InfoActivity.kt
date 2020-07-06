package kz.almat.myapplicationputextraintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_info.*
import java.sql.Date
import java.text.SimpleDateFormat

class InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        var intent = intent
        var action = intent.action

        var format = " "; var info = " "

        if (action.equals("kz.info.intent.action.showTime")) {
            format = "HH:mm:ss"
            info = "Time: "
        }else if (action.equals("kz.info.intent.action.showDate")) {
            format = "dd.MM.yyyy"
            info = "Date: "
        }

        var sdf = SimpleDateFormat(format)
        var dateTime = sdf.format(Date(System.currentTimeMillis()))

        infoDateTime.text = "$info: $dateTime"
    }
}
