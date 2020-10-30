package ru.flatstack.sample.ui.wh.list

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.v12ten.mvp_rentcycle.ui.trips.rv.WhListAdapter
import kotlinx.android.synthetic.main.fragment_wh_list.*
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import ru.flatstack.sample.R
import ru.flatstack.sample.di.Scopes
import ru.flatstack.sample.entities.SimpleWh
import ru.flatstack.sample.presentation.wh.list.WhListPresenter
import ru.flatstack.sample.presentation.wh.list.WhListView
import ru.flatstack.sample.ui.base.BaseFragment
import toothpick.Toothpick

class WhListFragment : BaseFragment(), WhListView {

    override val layoutResId = R.layout.fragment_wh_list

    companion object {

        fun newInstance() = WhListFragment()
    }

    @InjectPresenter
    lateinit var presenter: WhListPresenter

    @ProvidePresenter
    fun providePresenter(): WhListPresenter {
        return Toothpick.openScope(Scopes.APP_SCOPE)
            .getInstance(WhListPresenter::class.java)
    }

    lateinit var adapter: WhListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()
        listCreateButton.setOnClickListener {
            presenter.onWHCreateClicked()
        }
    }

    private fun initAdapter() {
        adapter = WhListAdapter() { items, position ->
            presenter.onItemClicked(items, position)
        }
        listRec.adapter = adapter
        listRec.layoutManager =
            LinearLayoutManager(context)
    }

    override fun setList(list: List<SimpleWh>) {
        adapter.setList(list)
    }
}