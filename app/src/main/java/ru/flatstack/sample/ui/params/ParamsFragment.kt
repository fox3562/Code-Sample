package ru.flatstack.sample.ui.params

import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import ru.flatstack.sample.R
import ru.flatstack.sample.di.Scopes
import ru.flatstack.sample.presentation.wh.list.ParamsPresenter
import ru.flatstack.sample.presentation.wh.list.ParamsView
import ru.flatstack.sample.ui.base.BaseFragment
import toothpick.Toothpick

class ParamsFragment : BaseFragment(), ParamsView {

    override val layoutResId = R.layout.fragment_params

    companion object {

        fun newInstance() = ParamsFragment()
    }

    @InjectPresenter
    lateinit var presenter: ParamsPresenter

    @ProvidePresenter
    fun providePresenter(): ParamsPresenter {
        return Toothpick.openScope(Scopes.APP_SCOPE)
            .getInstance(ParamsPresenter::class.java)
    }
}