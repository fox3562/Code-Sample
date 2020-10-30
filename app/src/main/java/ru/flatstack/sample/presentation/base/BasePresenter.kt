package ru.flatstack.sample.presentation.base

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
open class BasePresenter<V : BaseView> : MvpPresenter<V>(),
    CoroutineScope by CoroutineScope(Dispatchers.Main) {

}