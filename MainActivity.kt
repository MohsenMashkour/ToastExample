package com.mkrdeveloper.toastexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = "it is a text"

        val toast = Toast.makeText(this, text, Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER_VERTICAL, -200,-500)
        toast.show()
    }
}