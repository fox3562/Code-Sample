package ru.flatstack.sample.presentation.login

import ru.flatstack.sample.Screens
import ru.flatstack.sample.entities.Container
import ru.flatstack.sample.presentation.base.BasePresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class ContListPresenter @Inject constructor(
    private val router: Router
) : BasePresenter<ContListView>() {

    fun onItemClicked(items: List<Container>?, position: Int) {
        if (position % 2 == 0) {
            router.navigateTo(Screens.ContCreate)
        } else {
            router.navigateTo(Screens.ContEdit)
        }
    }
}