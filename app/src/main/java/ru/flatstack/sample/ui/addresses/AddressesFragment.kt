package ru.flatstack.sample.ui.addresses

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.v12ten.mvp_rentcycle.ui.trips.rv.AddressesAdapter
import kotlinx.android.synthetic.main.fragment_addresses.*
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import ru.flatstack.sample.R
import ru.flatstack.sample.di.Scopes
import ru.flatstack.sample.presentation.login.AddressesPresenter
import ru.flatstack.sample.presentation.login.AddressesView
import ru.flatstack.sample.ui.base.BaseFragment
import toothpick.Toothpick

class AddressesFragment : BaseFragment(), AddressesView {

    override val layoutResId = R.layout.fragment_addresses

    companion object {

        fun newInstance() = AddressesFragment()
    }

    @InjectPresenter
    lateinit var presenter: AddressesPresenter

    @ProvidePresenter
    fun providePresenter(): AddressesPresenter {
        return Toothpick.openScope(Scopes.APP_SCOPE)
            .getInstance(AddressesPresenter::class.java)
    }

    lateinit var adapter: AddressesAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()
    }

    private fun initAdapter() {
        adapter = AddressesAdapter() { items, position ->
            presenter.onItemClicked(items, position)
        }
        addrAddressRec.adapter = adapter
        addrAddressRec.layoutManager =
            LinearLayoutManager(context)
    }
}