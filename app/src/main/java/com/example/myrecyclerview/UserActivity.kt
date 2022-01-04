package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class UserActivity : AppCompatActivity() {
    private var title: String = "About"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        setActionBarTitle(title)
    }
    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}