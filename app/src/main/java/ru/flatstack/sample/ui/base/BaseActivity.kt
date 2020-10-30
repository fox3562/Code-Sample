package ru.flatstack.sample.ui.base

import android.os.Bundle
import moxy.MvpAppCompatActivity
import ru.flatstack.sample.R
import ru.flatstack.sample.presentation.base.BaseView

abstract class BaseActivity : MvpAppCompatActivity(), BaseView {

    abstract val layoutResId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)
        if (layoutResId != 0) setContentView(layoutResId)
    }
}