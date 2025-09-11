package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("TNIC", "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1 : Button = findViewById(R.id.button1)

        button1.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        var button2 : Button = findViewById(R.id.button2)

        button2.setOnClickListener {
            //val intent = Intent(this, MainActivity3::class.java)
            //startActivity(intent)
            val intent =  Intent();
            intent.setAction(android.content.Intent.ACTION_VIEW);
            intent.setType("image/*");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("TNIC", "onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.d("TNIC", "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TNIC", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TNIC", "onStop")
    }


}