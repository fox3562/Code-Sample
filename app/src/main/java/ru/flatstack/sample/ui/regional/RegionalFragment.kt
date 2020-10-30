package ru.flatstack.sample.ui.regional

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.v12ten.mvp_rentcycle.ui.trips.rv.RegionalAdapter
import kotlinx.android.synthetic.main.fragment_regional.*

import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import ru.flatstack.sample.R
import ru.flatstack.sample.di.Scopes
import ru.flatstack.sample.presentation.wh.list.RegionalPresenter
import ru.flatstack.sample.presentation.wh.list.RegionalView
import ru.flatstack.sample.ui.base.BaseFragment
import toothpick.Toothpick

class RegionalFragment : BaseFragment(), RegionalView {

    override val layoutResId = R.layout.fragment_regional

    companion object {

        fun newInstance() = RegionalFragment()
    }

    @InjectPresenter
    lateinit var presenter: RegionalPresenter

    @ProvidePresenter
    fun providePresenter(): RegionalPresenter {
        return Toothpick.openScope(Scopes.APP_SCOPE)
            .getInstance(RegionalPresenter::class.java)
    }

    lateinit var adapter: RegionalAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()
    }

    private fun initAdapter() {
        adapter = RegionalAdapter() { items, position ->
            presenter.onItemClicked(items, position)
        }
        regionalRec.adapter = adapter
        regionalRec.layoutManager =
            LinearLayoutManager(context)
    }
}