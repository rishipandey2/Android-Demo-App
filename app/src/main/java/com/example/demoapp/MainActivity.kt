package com.example.demoapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        // Explicit Intent
//        val explicitButton = findViewById<Button>(R.id.explicitButton)
//        explicitButton.setOnClickListener {
//            val explicitInent = Intent(this, ScreenActiviy2::class.java)
//            startActivity(explicitInent)
//            finish()

              val explicitButton = findViewById<Button>(R.id.explicitButton)
        explicitButton.setOnClickListener {
           val explicitInent = Intent(this, RecyclerViewActivity::class.java)
           startActivity(explicitInent)
           finish()

        }

        // Spinner button
        val spinnerButton = findViewById<Button>(R.id.spinnerButton)
        spinnerButton.setOnClickListener {
            val spinnerIntent = Intent(this, SpinnerActivity::class.java)
            startActivity(spinnerIntent)

        }

        // Implicit Intent

        val url = "https://chatgpt.com/c/677c7c11-74bc-8012-a105-345071b35f36"
        val implicitButton = findViewById<Button>(R.id.implicitButton)

        implicitButton.setOnClickListener {
            val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(implicitIntent)
        }
    }
}