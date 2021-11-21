package com.nphau.app.screens

import android.os.Bundle
// import org.koin.androidx.viewmodel.ext.android.viewModel
import com.nphau.android.shared.common.extensions.browse
import com.nphau.android.shared.common.extensions.safeClick
import com.nphau.android.shared.ui.activities.BindingActivity
import com.nphau.app.databinding.ActivityMainBinding
// import com.nphau.app.vm.MainViewModel

class MainActivity : BindingActivity<ActivityMainBinding>() {

    // private val viewModel by viewModel<MainViewModel>()

    override fun onSyncViews(savedInstanceState: Bundle?) {
        super.onSyncViews(savedInstanceState)
        with(binding) {
            buttonWelcome.safeClick {
                browse("https://nphau.medium.com/")
            }
            toolBar.setNavigationOnClickListener { finish() }
        }
    }

}