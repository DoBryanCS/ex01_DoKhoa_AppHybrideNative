package com.example.ex01_dokhoa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val t1: TextView = this.findViewById(R.id.textView)
        val t2: TextView = this.findViewById(R.id.textView2)
        val t3: TextView = this.findViewById(R.id.textView3)
        val t4: TextView = this.findViewById(R.id.textView4)

        val v1 = this.intent.getStringExtra("title")
        val v2 = this.intent.getStringExtra("plot")
        val v3 = this.intent.getStringExtra("studio")
        val v4 = this.intent.getStringExtra("genre")

        t1.text = v1
        t2.text = v2
        t3.text = v3
        t4.text = v4
    }
}