package com.example.assignment06

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

var extra = "ans"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var ans = ""

        radioGroup.setOnCheckedChangeListener { group, i ->
            if (radioButton2.isChecked) {
                ans = "ถูกต้อง"
            } else {
                ans = "ไม่ถูกต้อง"
            }
        }
        submit.setOnClickListener {
            if (ans == "") {
                Toast.makeText(this, "โปรดเลือกคำตอบ", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra(extra,ans)
                startActivity(intent)
            }
        }


    }
}