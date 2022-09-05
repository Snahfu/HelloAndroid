package id.ac.ubaya.informatika.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}

fun calculateNisbi3(nas:Double):String = when {
    nas < 40.0 -> "E"
    nas >= 40.0 -> "A"
    else -> "Haiya"
}