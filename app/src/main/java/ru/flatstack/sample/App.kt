package ru.flatstack.sample

import android.app.Application
import ru.flatstack.sample.di.Scopes
import ru.flatstack.sample.di.modules.AppModule
import timber.log.Timber
import toothpick.Toothpick

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        initLogger()
        initAppScope()
    }

    private fun initLogger() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    private fun initAppScope() {
        val appScope = Toothpick.openScope(Scopes.APP_SCOPE)
        appScope.installModules(
            AppModule(this)
        )
    }
}