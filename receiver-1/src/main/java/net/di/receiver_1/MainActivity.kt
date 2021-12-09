package net.di.receiver_1

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Receive broadcast from External App
        val intentFilter = IntentFilter("net.di.receiver_1")
        val receiver = Receiver()
        registerReceiver(receiver, intentFilter)
    }
}