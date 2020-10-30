package ru.flatstack.sample.ui.source

import android.os.Bundle
import android.view.View
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import ru.flatstack.sample.R
import ru.flatstack.sample.di.Scopes
import ru.flatstack.sample.presentation.wh.list.SourcePresenter
import ru.flatstack.sample.presentation.wh.list.SourceView
import ru.flatstack.sample.ui.base.BaseFragment
import toothpick.Toothpick

class SourceFragment : BaseFragment(), SourceView {

    override val layoutResId = R.layout.fragment_source

    companion object {

        fun newInstance() = SourceFragment()
    }

    @InjectPresenter
    lateinit var presenter: SourcePresenter

    @ProvidePresenter
    fun providePresenter(): SourcePresenter {
        return Toothpick.openScope(Scopes.APP_SCOPE)
            .getInstance(SourcePresenter::class.java)
    }
}