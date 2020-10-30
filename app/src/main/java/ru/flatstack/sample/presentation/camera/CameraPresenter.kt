package ru.flatstack.sample.presentation.login

import ru.flatstack.sample.entities.WhMedia
import ru.flatstack.sample.presentation.base.BasePresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class CameraPresenter @Inject constructor(
    private val router: Router
) : BasePresenter<CameraView>() {

    fun onItemClicked(items: List<WhMedia>?, position: Int) {
        router.exit()
    }
}