package kz.almat.myapplicationputextraintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSub.setOnClickListener {
            val intent = Intent(this, DisplayActivity::class.java)
            intent.putExtra("Fname", edText1.text.toString())
            intent.putExtra("Lname", edText2.text.toString())
            startActivity(intent)
        }
        btnDate.setOnClickListener(this)
        btnTime.setOnClickListener(this)
        bTime.setOnClickListener(this)
        bDate.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var intent: Intent
        when (v!!.id) {
            R.id.btnTime -> {
                intent = Intent("kz.almat.intent.action.showTime")
                startActivity(intent)
            }
            R.id.btnDate -> {
                intent = Intent("kz.almat.intent.action.showDate")
                startActivity(intent)
            }
            R.id.bTime -> {
                intent = Intent("kz.info.intent.action.showTime")
                startActivity(intent)
            }
            R.id.bDate -> {
                intent = Intent("kz.info.intent.action.showDate")
                startActivity(intent)
            }
        }
    }
}
