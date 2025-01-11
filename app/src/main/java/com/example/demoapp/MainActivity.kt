package com.example.demoapp

import android.annotation.SuppressLint
import android.app.AlertDialog

import android.content.Intent
import android.net.Uri
import android.os.Build.VERSION_CODES.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.demoapp.databinding.ActivityMainBinding
import com.example.demoapp.R



class MainActivity : AppCompatActivity() {

    private lateinit var fragmentManager:FragmentManager
    private lateinit var binding: ActivityMainBinding

   @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        Thread.sleep(3000)
        installSplashScreen()
        setContentView(binding.root)


        binding.buttonFragment1.setOnClickListener {
            goToFragment(Fragment1())
        }

        binding.buttonFragment2.setOnClickListener {
            goToFragment(Fragment2())
        }

        // Explicit Intent
//        val explicitButton = findViewById<Button>(R.id.explicitButton)
//        explicitButton.setOnClickListener {
//            val explicitInent = Intent(this, ScreenActiviy2::class.java)
//            startActivity(explicitInent)
//            finish()

//              val explicitButton = findViewById<Button>(R.id.explicitButton)
//        explicitButton.setOnClickListener {
//           val explicitInent = Intent(this, RecyclerViewActivity::class.java)
//           startActivity(explicitInent)
//           finish()

//        }

//        // Spinner button
//        val spinnerButton = findViewById<Button>(R.id.spinnerButton)
//        spinnerButton.setOnClickListener {
//            showAlertDialog()
////            val spinnerIntent = Intent(this, SpinnerActivity::class.java)
////            startActivity(spinnerIntent)
//
//        }

        // Implicit Intent

//        val url = "https://chatgpt.com/c/677c7c11-74bc-8012-a105-345071b35f36"
//        val implicitButton = findViewById<Button>(R.id.implicitButton)
//
//        implicitButton.setOnClickListener {
//            val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
//            startActivity(implicitIntent)
//        }
//    }

//    private fun showAlertDialog(){
//        val builder = AlertDialog.Builder(this)
//        builder.setTitle("Spinner")
//            .setMessage("Do you want to open the spinner ?")
//            .setPositiveButton("Yes"){dialog, which ->
////                Toast.makeText(this, "The spinner is successfully opened", Toast.LENGTH_SHORT).show()
//                val spinnerIntent = Intent(this, SpinnerActivity::class.java)
//                startActivity(spinnerIntent)
//
//
//            }
//            .setNegativeButton("No"){dialog, which ->
//                dialog.dismiss()
//            }
//
//        val alertDialog:AlertDialog = builder.create()
//        alertDialog.show()
//
    }

    private fun goToFragment(fragment: Fragment){

        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment).commit()
    }
}