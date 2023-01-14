/*
 * Created by nphau on 1/14/23, 2:35 PM
 * Copyright (c) 2023 . All rights reserved.
 * Last modified 1/14/23, 2:35 PM
 */
package sg.nphau.app.screens

import android.os.Bundle
import sg.nphau.android.shared.common.extensions.browse
import sg.nphau.android.shared.common.extensions.safeClick
// import org.koin.androidx.viewmodel.ext.android.viewModel
import sg.nphau.android.shared.ui.activities.BindingActivity
import sg.nphau.app.databinding.ActivityMainBinding
import sg.nphau.app.utils.Lifetime

// import com.nphau.app.vm.MainViewModel

class MainActivity : BindingActivity<ActivityMainBinding>() {

    // private val viewModel by viewModel<MainViewModel>()

    override fun onSyncViews(savedInstanceState: Bundle?) {
        super.onSyncViews(savedInstanceState)
        with(binding) {
            buttonWelcome.safeClick {
                browse("https://nphausg.medium.com/")
            }
            toolBar.setNavigationOnClickListener { finish() }
            textTime.text = String.format(
                "Last active (System) %s\nLast active (SystemClock) %s",
                Lifetime.systemTime.interval.toString(),
                Lifetime.systemClockTime.interval.toString()
            )
        }
    }

}