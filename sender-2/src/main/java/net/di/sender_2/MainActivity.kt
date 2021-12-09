package net.di.sender_2

import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent()
        intent.action = "net.di.receiver_1"
        intent.putExtra("sender", "sender_2")
        intent.component = ComponentName("net.di.receiver_1", "net.di.receiver_1.Receiver")
        sendBroadcast(intent)
    }
}