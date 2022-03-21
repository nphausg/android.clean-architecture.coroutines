package sg.nphau.app.vm

import sg.nphau.android.shared.udf.UICommand
import sg.nphau.android.shared.udf.UIState
import sg.nphau.android.shared.vm.SharedViewModel

class MainState : UIState
class MainCommand : UICommand

class MainViewModel : SharedViewModel<MainCommand, MainState>() {

    override suspend fun onCommand(command: UICommand) {

    }
}