package kz.almat.myapplicationputextraintent

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_display.*

class DisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        var intent = intent
        val fName = intent.getStringExtra("Fname")
        val lName = intent.getStringExtra("Lname")
//        val tv = findViewById<TextView>(R.id.tvView)
        tvView.text = "Your name is: " + fName + " " + lName
    }

}
