package ru.flatstack.sample.presentation.login

import ru.flatstack.sample.Screens
import ru.flatstack.sample.entities.WhMedia
import ru.flatstack.sample.presentation.base.BasePresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class ContEditPresenter @Inject constructor(
    private val router: Router
) : BasePresenter<ContEditView>() {

    fun onItemClicked(items: List<WhMedia>?, position: Int) {
        router.navigateTo(Screens.Camera)
    }
}