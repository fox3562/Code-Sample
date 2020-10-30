package ru.flatstack.sample.presentation.main

import ru.flatstack.sample.Screens
import ru.flatstack.sample.presentation.base.BasePresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class MainPresenter @Inject constructor(
    private val router: Router
) : BasePresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        router.newRootScreen(Screens.WhList)
    }

    fun onBackArrowPressed() {
        router.exit()
    }
}