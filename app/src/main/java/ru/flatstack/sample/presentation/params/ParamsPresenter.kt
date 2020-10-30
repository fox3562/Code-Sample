package ru.flatstack.sample.presentation.wh.list

import ru.flatstack.sample.presentation.base.BasePresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class ParamsPresenter @Inject constructor(
    private val router: Router
) : BasePresenter<ParamsView>() {

}