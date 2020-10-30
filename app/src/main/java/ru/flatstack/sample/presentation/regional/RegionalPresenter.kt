package ru.flatstack.sample.presentation.wh.list

import ru.flatstack.sample.entities.RegOperator
import ru.flatstack.sample.presentation.base.BasePresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class RegionalPresenter @Inject constructor(
    private val router: Router
) : BasePresenter<RegionalView>() {

    fun onItemClicked(items: List<RegOperator>?, position: Int) {
        router.exit()
    }
}