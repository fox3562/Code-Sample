package ru.flatstack.sample.ui.wh.current

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_wh_current.*
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import ru.flatstack.sample.R
import ru.flatstack.sample.di.Scopes
import ru.flatstack.sample.presentation.login.WhCurrentPresenter
import ru.flatstack.sample.presentation.login.WhCurrentView
import ru.flatstack.sample.ui.base.BaseFragment
import toothpick.Toothpick

class WhCurrentFragment : BaseFragment(), WhCurrentView {

    override val layoutResId = R.layout.fragment_wh_current

    companion object {

        fun newInstance() = WhCurrentFragment()
    }

    @InjectPresenter
    lateinit var presenter: WhCurrentPresenter

    @ProvidePresenter
    fun providePresenter(): WhCurrentPresenter {
        return Toothpick.openScope(Scopes.APP_SCOPE)
            .getInstance(WhCurrentPresenter::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        whAddressButton.setOnClickListener {
            presenter.onAddressClicked()
        }
        whParamsButton.setOnClickListener {
            presenter.onParamsClicked()
        }
        whContainersButton.setOnClickListener {
            presenter.onContaindersClicked()
        }
        whOwnerButton.setOnClickListener {
            presenter.onOwnerClicked()
        }
        whOperatorButton.setOnClickListener {
            presenter.onOperatorClicked()
        }
        whScheduleButton.setOnClickListener {
            presenter.onScheduleClicked()
        }
        whSourceButton.setOnClickListener {
            presenter.onSourceClicked()
        }
        whRegionalButton.setOnClickListener {
            presenter.onRegionalClicked()
        }
    }
}