package ru.flatstack.sample.ui.container.list

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.v12ten.mvp_rentcycle.ui.trips.rv.ContListAdapter
import kotlinx.android.synthetic.main.fragment_cont_list.*
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import ru.flatstack.sample.R
import ru.flatstack.sample.di.Scopes
import ru.flatstack.sample.presentation.login.ContListPresenter
import ru.flatstack.sample.presentation.login.ContListView
import ru.flatstack.sample.ui.base.BaseFragment
import toothpick.Toothpick

class ContListFragment : BaseFragment(), ContListView {

    override val layoutResId = R.layout.fragment_cont_list

    companion object {

        fun newInstance() = ContListFragment()
    }

    @InjectPresenter
    lateinit var presenter: ContListPresenter

    @ProvidePresenter
    fun providePresenter(): ContListPresenter {
        return Toothpick.openScope(Scopes.APP_SCOPE)
            .getInstance(ContListPresenter::class.java)
    }

    lateinit var adapter: ContListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()
    }

    private fun initAdapter() {
        adapter = ContListAdapter() { items, position ->
            presenter.onItemClicked(items, position)
        }
        contListRec.adapter = adapter
        contListRec.layoutManager =
            LinearLayoutManager(context)
    }
}