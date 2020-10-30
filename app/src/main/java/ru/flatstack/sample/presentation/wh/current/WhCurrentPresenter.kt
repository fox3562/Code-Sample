package ru.flatstack.sample.presentation.login

import ru.flatstack.sample.Screens
import ru.flatstack.sample.presentation.base.BasePresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class WhCurrentPresenter @Inject constructor(
    private val router: Router
) : BasePresenter<WhCurrentView>() {

    fun onAddressClicked() {
        router.navigateTo(Screens.Addresses)
    }

    fun onParamsClicked() {
        router.navigateTo(Screens.Params)
    }

    fun onContaindersClicked() {
        router.navigateTo(Screens.ContList)
    }

    fun onOwnerClicked() {
        router.navigateTo(Screens.Owner)
    }

    fun onOperatorClicked() {
        router.navigateTo(Screens.Operator)
    }

    fun onScheduleClicked() {
        router.navigateTo(Screens.Schedule)
    }

    fun onSourceClicked() {
        router.navigateTo(Screens.Source)
    }

    fun onRegionalClicked() {
        router.navigateTo(Screens.RegOperator)
    }
}