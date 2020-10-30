package ru.flatstack.sample.presentation.wh.list

import moxy.viewstate.strategy.alias.AddToEndSingle
import ru.flatstack.sample.entities.SimpleWh
import ru.flatstack.sample.presentation.base.BaseView

interface WhListView : BaseView {

    @AddToEndSingle
    fun setList(list: List<SimpleWh>)
}