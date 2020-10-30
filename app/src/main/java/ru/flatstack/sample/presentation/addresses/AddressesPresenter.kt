package ru.flatstack.sample.presentation.login

import ru.flatstack.sample.entities.FiasAddress
import ru.flatstack.sample.presentation.base.BasePresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class AddressesPresenter @Inject constructor(
    private val router: Router
) : BasePresenter<AddressesView>() {

    fun onItemClicked(items: List<FiasAddress>?, position: Int) {
        router.exit()
    }
}