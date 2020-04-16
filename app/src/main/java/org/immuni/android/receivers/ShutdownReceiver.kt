package org.immuni.android.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.bendingspoons.pico.Pico
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.immuni.android.ImmuniApplication
import org.immuni.android.picoMetrics.RebootEventReceived
import org.immuni.android.picoMetrics.ShutdownEventReceived
import org.immuni.android.service.AlarmsManager
import org.immuni.android.util.log
import org.koin.core.KoinComponent
import org.koin.core.inject

class ShutdownReceiver : BroadcastReceiver(), KoinComponent {

    private val pico: Pico by inject()

    override fun onReceive(context: Context, intent: Intent) {

        log("Shutdown event received...")

        GlobalScope.launch {
            pico.trackEvent(ShutdownEventReceived().userAction)
            pico.flush()
        }
    }
}
