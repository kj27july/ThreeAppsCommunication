package net.di.receiver_1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class Receiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val sender1 = intent?.getStringExtra("sender")
        Log.d("kajal", "onReceive:$sender1")
    }
}