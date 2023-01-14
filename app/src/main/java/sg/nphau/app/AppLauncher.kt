/*
 * Created by nphau on 1/14/23, 1:39 PM
 * Copyright (c) 2023 . All rights reserved.
 * Last modified 1/14/23, 1:38 PM
 */

package sg.nphau.app

import android.os.SystemClock
import androidx.lifecycle.LifecycleOwner
import org.koin.core.module.Module
import sg.nphau.android.Launcher
import sg.nphau.android.shared.ui.theme.ThemeUtils
import sg.nphau.app.libs.CrashlyticsLoggingTree
import sg.nphau.app.utils.Lifetime

class AppLauncher : Launcher() {

    //private var initializers = KoinJavaComponent.getKoin().getAll<PluginInitializer>()

    override fun onCreate() {
        super.onCreate()
//        SharedDI.startDI(
//            launcher = this@AppLauncher,
//            enableLogs = isDebug(),
//            modules = applicationModules() + module {
//                single<Context> { this@AppLauncher }
//                single { { onLifecycleCreate() } }
//            }
//        )
        ThemeUtils.setNightMode(false)

        // initializers
//        initializers.distinct().forEach { plugin ->
//            plugin.initialize(this)
//        }
    }

    override fun releaseLoggingTree() = CrashlyticsLoggingTree()

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        // initializers.distinct().forEach { it.onEnterBackground() }
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        // initializers.distinct().forEach { it.onEnterForeground() }
    }

    override fun isDebug(): Boolean = BuildConfig.DEBUG

    private fun applicationModules() = emptyList<Module>()

}