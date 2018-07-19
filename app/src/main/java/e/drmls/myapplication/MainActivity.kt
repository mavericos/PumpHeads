package e.drmls.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
val SPLASH_TIME_OUT =1500L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed(object:Runnable{
            public override fun run() {
                val home = Intent (this@MainActivity,Main2Activity::class.java)
                startActivity(home)
                finish()
            }
        }, SPLASH_TIME_OUT)
    }
}
