package ru.flatstack.sample.ui.camera

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.v12ten.mvp_rentcycle.ui.trips.rv.CameraAdapter
import kotlinx.android.synthetic.main.fragment_camera.*
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import ru.flatstack.sample.R
import ru.flatstack.sample.di.Scopes
import ru.flatstack.sample.presentation.login.CameraPresenter
import ru.flatstack.sample.presentation.login.CameraView
import ru.flatstack.sample.ui.base.BaseFragment
import toothpick.Toothpick

class CameraFragment : BaseFragment(), CameraView {

    override val layoutResId = R.layout.fragment_camera

    companion object {

        fun newInstance() = CameraFragment()
    }

    @InjectPresenter
    lateinit var presenter: CameraPresenter

    @ProvidePresenter
    fun providePresenter(): CameraPresenter {
        return Toothpick.openScope(Scopes.APP_SCOPE)
            .getInstance(CameraPresenter::class.java)
    }

    lateinit var adapter: CameraAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()
    }

    private fun initAdapter() {
        adapter = CameraAdapter() { items, position ->
            presenter.onItemClicked(items, position)
        }
        cameraRec.adapter = adapter
        cameraRec.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }
}