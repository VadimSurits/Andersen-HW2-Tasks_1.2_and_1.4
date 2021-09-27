package com.example.android.helloconstraint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var tvCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        tvCount = findViewById(R.id.tv_sa_count)
        val count = intent.getIntExtra(EXTRA_MESSAGE, 0)
        tvCount.text = count.toString()
    }
}