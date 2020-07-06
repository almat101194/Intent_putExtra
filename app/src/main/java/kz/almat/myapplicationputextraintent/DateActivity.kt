package kz.almat.myapplicationputextraintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_date.*
import java.sql.Date
import java.text.SimpleDateFormat

class DateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date)

        var sdf = SimpleDateFormat("dd.MM.yyyy")
        var date = sdf.format(Date(System.currentTimeMillis()))

        tvDate.text = date
    }
}
