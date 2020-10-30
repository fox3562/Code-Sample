package ru.flatstack.sample.ui.schedule

import android.os.Bundle
import android.view.View
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import ru.flatstack.sample.R
import ru.flatstack.sample.di.Scopes
import ru.flatstack.sample.presentation.wh.list.SchedulePresenter
import ru.flatstack.sample.presentation.wh.list.ScheduleView
import ru.flatstack.sample.ui.base.BaseFragment
import toothpick.Toothpick

class ScheduleFragment : BaseFragment(), ScheduleView {

    override val layoutResId = R.layout.fragment_schedule

    companion object {

        fun newInstance() = ScheduleFragment()
    }

    @InjectPresenter
    lateinit var presenter: SchedulePresenter

    @ProvidePresenter
    fun providePresenter(): SchedulePresenter {
        return Toothpick.openScope(Scopes.APP_SCOPE)
            .getInstance(SchedulePresenter::class.java)
    }
}