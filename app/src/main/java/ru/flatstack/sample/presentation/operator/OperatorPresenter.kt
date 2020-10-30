package ru.flatstack.sample.presentation.login

import ru.flatstack.sample.presentation.base.BasePresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class OperatorPresenter @Inject constructor(
    private val router: Router
) : BasePresenter<OperatorView>() {

}