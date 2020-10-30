package ru.flatstack.sample.ui.owner

import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import ru.flatstack.sample.R
import ru.flatstack.sample.di.Scopes
import ru.flatstack.sample.presentation.login.OwnerPresenter
import ru.flatstack.sample.presentation.login.OwnerView
import ru.flatstack.sample.ui.base.BaseFragment
import toothpick.Toothpick

class OwnerFragment : BaseFragment(), OwnerView {

    override val layoutResId = R.layout.fragment_owner

    companion object {

        fun newInstance() = OwnerFragment()
    }

    @InjectPresenter
    lateinit var presenter: OwnerPresenter

    @ProvidePresenter
    fun providePresenter(): OwnerPresenter {
        return Toothpick.openScope(Scopes.APP_SCOPE)
            .getInstance(OwnerPresenter::class.java)
    }
}