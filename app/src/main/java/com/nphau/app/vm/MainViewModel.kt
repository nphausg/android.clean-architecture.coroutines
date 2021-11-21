package com.nphau.app.vm

import com.nphau.android.shared.udf.UICommand
import com.nphau.android.shared.udf.UIState
import com.nphau.android.shared.vm.SharedViewModel

class MainState : UIState
class MainCommand : UICommand

class MainViewModel : SharedViewModel<MainCommand, MainState>() {

    override suspend fun onCommand(command: UICommand) {

    }
}