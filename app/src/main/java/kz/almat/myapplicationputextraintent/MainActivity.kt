package kz.almat.myapplicationputextraintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSub.setOnClickListener {
            val intent = Intent(this, DisplayActivity::class.java)
            intent.putExtra("Fname", edText1.text.toString())
            intent.putExtra("Lname", edText2.text.toString())
            startActivity(intent)
        }
    }
}
