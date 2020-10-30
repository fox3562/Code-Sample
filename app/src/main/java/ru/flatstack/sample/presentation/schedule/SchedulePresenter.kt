package ru.flatstack.sample.presentation.wh.list

import ru.flatstack.sample.presentation.base.BasePresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class SchedulePresenter @Inject constructor(
    private val router: Router
) : BasePresenter<ScheduleView>() {

}