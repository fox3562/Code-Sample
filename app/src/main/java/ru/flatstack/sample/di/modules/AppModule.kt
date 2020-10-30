package ru.flatstack.sample.di.modules

import android.content.Context
import androidx.room.Room
import com.v12ten.mvp_rentcycle.model.data.server.ApiAdapter
import com.v12ten.mvp_rentcycle.model.data.server.ApiClient
import ru.flatstack.sample.model.data.db.RoomDB
import ru.flatstack.sample.model.data.db.dao.WhDao
import ru.flatstack.sample.model.interactors.WhInteractor
import ru.flatstack.sample.model.repository.IWhRepository
import ru.flatstack.sample.model.repository.WhRepository
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import toothpick.config.Module

class AppModule(private val context: Context) : Module() {

    init {
        // DB
        val database = Room.databaseBuilder(context, RoomDB::class.java, "RoomDB").build()
        bind(RoomDB::class.java).toInstance(database)
        val whDao: WhDao = database.whDao()
        bind(WhDao::class.java).toInstance(whDao)

        // Navigate
        val cicerone = Cicerone.create()
        bind(Router::class.java).toInstance(cicerone.router)
        bind(NavigatorHolder::class.java).toInstance(cicerone.navigatorHolder)

        // Api
        val apiClient = ApiAdapter.apiClient
        bind(ApiClient::class.java).toInstance(apiClient)

        // Repositories & Interactors
        bind(IWhRepository::class.java).toInstance(WhRepository(apiClient, whDao))
        bind(WhRepository::class.java).singleton()
        bind(WhInteractor::class.java).singleton()
    }
}