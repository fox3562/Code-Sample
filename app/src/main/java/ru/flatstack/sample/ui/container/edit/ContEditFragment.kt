package ru.flatstack.sample.ui.container.edit

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.v12ten.mvp_rentcycle.ui.trips.rv.ContEditAdapter
import kotlinx.android.synthetic.main.fragment_cont_edit.*
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import ru.flatstack.sample.R
import ru.flatstack.sample.di.Scopes
import ru.flatstack.sample.presentation.login.ContEditPresenter
import ru.flatstack.sample.presentation.login.ContEditView
import ru.flatstack.sample.ui.base.BaseFragment
import toothpick.Toothpick

class ContEditFragment : BaseFragment(), ContEditView {

    override val layoutResId = R.layout.fragment_cont_edit

    companion object {

        fun newInstance() = ContEditFragment()
    }

    @InjectPresenter
    lateinit var presenter: ContEditPresenter

    @ProvidePresenter
    fun providePresenter(): ContEditPresenter {
        return Toothpick.openScope(Scopes.APP_SCOPE)
            .getInstance(ContEditPresenter::class.java)
    }

    lateinit var adapter: ContEditAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()
    }

    private fun initAdapter() {
        adapter = ContEditAdapter() { items, position ->
            presenter.onItemClicked(items, position)
        }
        contEditFilesRec.adapter = adapter
        contEditFilesRec.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }
}