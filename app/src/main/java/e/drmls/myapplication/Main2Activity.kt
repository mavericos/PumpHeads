package e.drmls.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button.setOnClickListener {
            val intent = Intent(this,Main3Activity::class.java)
            startActivity(intent)
        }
        val myBtn = findViewById<Button>(R.id.myBtn)
        val myTxt = findViewById<TextView>(R.id.myTextView)
    }
}