package ru.flatstack.sample.presentation.login

import ru.flatstack.sample.presentation.base.BasePresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class OwnerPresenter @Inject constructor(
    private val router: Router
) : BasePresenter<OwnerView>() {

}