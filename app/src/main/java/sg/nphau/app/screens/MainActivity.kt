package sg.nphau.app.screens

import android.os.Bundle
import sg.nphau.android.shared.common.extensions.browse
import sg.nphau.android.shared.common.extensions.safeClick
// import org.koin.androidx.viewmodel.ext.android.viewModel
import sg.nphau.android.shared.ui.activities.BindingActivity
import sg.nphau.app.databinding.ActivityMainBinding

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