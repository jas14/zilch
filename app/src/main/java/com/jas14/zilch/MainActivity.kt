package com.jas14.zilch

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_rules).setOnClickListener {
            Intent(this, RulesActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}
