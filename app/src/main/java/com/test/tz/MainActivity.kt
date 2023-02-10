package com.test.tz

import android.Manifest.permission.POST_NOTIFICATIONS
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (  ContextCompat.checkSelfPermission(applicationContext,POST_NOTIFICATIONS)!=PackageManager.PERMISSION_GRANTED){
                requestPermissions(arrayOf(POST_NOTIFICATIONS),100)
            }

        }

    }
}