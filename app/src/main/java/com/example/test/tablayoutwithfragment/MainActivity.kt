package com.example.test.tablayoutwithfragment

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun NavSecondPage (view: View) {
        val intent = Intent(applicationContext, SecondPage::class.java)
        startActivity(intent)
    }

}
