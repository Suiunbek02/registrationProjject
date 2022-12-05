package com.example.registrationprojject.ui.activity

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.registrationprojject.R
import com.example.registrationprojject.ui.fragments.sign.SignFlowFragment
import kotlinx.coroutines.NonCancellable.start
import java.lang.Thread.sleep

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)

        supportActionBar?.hide()

        val handler  = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}



