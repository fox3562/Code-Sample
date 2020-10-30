package ru.flatstack.sample.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import moxy.MvpAppCompatFragment
import ru.flatstack.sample.presentation.base.BaseView

abstract class BaseFragment : MvpAppCompatFragment(), BaseView {

    abstract val layoutResId: Int

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(layoutResId, container, false)!!
}