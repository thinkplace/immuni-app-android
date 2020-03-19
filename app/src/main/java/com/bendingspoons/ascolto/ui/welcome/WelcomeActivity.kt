package com.bendingspoons.ascolto.ui.welcome

import android.os.Bundle
import android.os.PersistableBundle
import androidx.navigation.findNavController
import com.bendingspoons.ascolto.AscoltoActivity
import com.bendingspoons.ascolto.R
import com.bendingspoons.base.extensions.setDarkStatusBarFullscreen
import org.koin.androidx.viewmodel.ext.android.getStateViewModel

class WelcomeActivity : AscoltoActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_activity)
        findNavController(R.id.nav_host_fragment).setGraph(R.navigation.welcome)
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
    }
}
