package ru.flatstack.sample.ui.container.create

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.v12ten.mvp_rentcycle.ui.trips.rv.ContCreateAdapter
import kotlinx.android.synthetic.main.fragment_cont_create.*
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import ru.flatstack.sample.R
import ru.flatstack.sample.di.Scopes
import ru.flatstack.sample.presentation.login.ContCreatePresenter
import ru.flatstack.sample.presentation.login.ContCreateView
import ru.flatstack.sample.ui.base.BaseFragment
import toothpick.Toothpick

class ContCreateFragment : BaseFragment(), ContCreateView {

    override val layoutResId = R.layout.fragment_cont_create

    companion object {

        fun newInstance() = ContCreateFragment()
    }

    @InjectPresenter
    lateinit var presenter: ContCreatePresenter

    @ProvidePresenter
    fun providePresenter(): ContCreatePresenter {
        return Toothpick.openScope(Scopes.APP_SCOPE)
            .getInstance(ContCreatePresenter::class.java)
    }

    lateinit var adapter: ContCreateAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()
    }

    private fun initAdapter() {
        adapter = ContCreateAdapter() { items, position ->
            presenter.onItemClicked(items, position)
        }
        contCreateFilesRec.adapter = adapter
        contCreateFilesRec.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }
}