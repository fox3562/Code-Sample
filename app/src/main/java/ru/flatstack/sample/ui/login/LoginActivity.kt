package ru.flatstack.sample.ui.login

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import ru.flatstack.sample.R
import ru.flatstack.sample.di.Scopes
import ru.flatstack.sample.presentation.login.LoginPresenter
import ru.flatstack.sample.presentation.login.LoginView
import ru.flatstack.sample.ui.base.BaseActivity
import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import toothpick.Toothpick
import javax.inject.Inject

class LoginActivity : BaseActivity(), LoginView {

    override val layoutResId = R.layout.activity_login

    @InjectPresenter
    lateinit var presenter: LoginPresenter

    @ProvidePresenter
    fun providePresenter(): LoginPresenter {
        return Toothpick.openScope(Scopes.APP_SCOPE)
            .getInstance(LoginPresenter::class.java)
    }

    @Inject
    lateinit var navigatorHolder: NavigatorHolder

    private val navigator: Navigator = SupportAppNavigator(this, -1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toothpick.inject(this, Toothpick.openScope(Scopes.APP_SCOPE))
        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        loginSignInButton.setOnClickListener {
            presenter.onSignInClicked()
        }
    }

    override fun onResume() {
        super.onResume()

        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()

        super.onPause()
    }
}