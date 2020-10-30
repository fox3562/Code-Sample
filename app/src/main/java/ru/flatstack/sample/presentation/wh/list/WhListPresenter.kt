package ru.flatstack.sample.presentation.wh.list

import kotlinx.coroutines.launch
import ru.flatstack.sample.Screens
import ru.flatstack.sample.entities.SimpleWh
import ru.flatstack.sample.model.interactors.WhInteractor
import ru.flatstack.sample.presentation.base.BasePresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class WhListPresenter @Inject constructor(
    private val router: Router,
    private val whInteractor: WhInteractor
) : BasePresenter<WhListView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        loadWhList()
    }

    fun onWHCreateClicked() {
        router.navigateTo(Screens.WhCurrent)
    }

    fun onItemClicked(items: List<SimpleWh>, position: Int) {
        router.navigateTo(Screens.WhCurrent)
    }

    fun loadWhList() {
        launch {
            try {
                val result = whInteractor.getWhList()
                viewState.setList(result)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}