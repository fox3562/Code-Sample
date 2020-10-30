package ru.flatstack.sample.ui.operator

import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import ru.flatstack.sample.R
import ru.flatstack.sample.di.Scopes
import ru.flatstack.sample.presentation.login.OperatorPresenter
import ru.flatstack.sample.presentation.login.OperatorView
import ru.flatstack.sample.ui.base.BaseFragment
import toothpick.Toothpick

class OperatorFragment : BaseFragment(), OperatorView {

    override val layoutResId = R.layout.fragment_operator

    companion object {

        fun newInstance() = OperatorFragment()
    }

    @InjectPresenter
    lateinit var presenter: OperatorPresenter

    @ProvidePresenter
    fun providePresenter(): OperatorPresenter {
        return Toothpick.openScope(Scopes.APP_SCOPE)
            .getInstance(OperatorPresenter::class.java)
    }
}