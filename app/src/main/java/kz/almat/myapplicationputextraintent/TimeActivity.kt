package kz.almat.myapplicationputextraintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_time.*
import java.text.SimpleDateFormat
import java.util.*

class TimeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)

        var sdf = SimpleDateFormat("HH:mm:ss")
        var time = sdf.format(Date(System.currentTimeMillis()))

        tvTime.text = time
    }
}
