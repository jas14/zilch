package com.jas14.zilch

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class RulesAndScoringAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    private val names: List<String> = listOf("Rules", "Scoring");

    override fun getItem(position: Int): Fragment? {
        return when (position) {
            0 -> RulesFragment()
            1 -> ScoringFragment()
            else -> null
        }
    }

    override fun getCount(): Int = 2

    override fun getPageTitle(position: Int): CharSequence? = names[position]
}