package com.omersungur.countdowntimer_android

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView : TextView = findViewById(R.id.textView)

        object : CountDownTimer(10000, 1000) { // 10 saniye içinde 1 saniye aralıklarla işimizi yapıyoruz.

            override fun onTick(millisUntilFinished: Long) {
                textView.text = "Left: " + millisUntilFinished/1000
            }

            override fun onFinish() {
                Toast.makeText(this@MainActivity,"Süre Doldu",Toast.LENGTH_LONG).show()
                textView.text = "Finished"

            }
        }.start()

    }
}