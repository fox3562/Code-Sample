package ru.flatstack.sample.presentation.login

import ru.flatstack.sample.Screens
import ru.flatstack.sample.presentation.base.BasePresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class LoginPresenter @Inject constructor(
    private val router: Router
) : BasePresenter<LoginView>() {

    fun onSignInClicked() {
        router.navigateTo(Screens.Main)
    }
}