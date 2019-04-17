package com.jas14.zilch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager

class RulesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rules_and_scoring)

        val viewPager = findViewById<ViewPager>(R.id.pager)
        viewPager.adapter = RulesAndScoringAdapter(supportFragmentManager)
    }
}
