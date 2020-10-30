package ru.flatstack.sample.model.repository

import com.v12ten.mvp_rentcycle.model.data.server.ApiClient
import ru.flatstack.sample.entities.SimpleWh
import ru.flatstack.sample.model.data.db.dao.WhDao
import javax.inject.Inject

class WhRepository @Inject constructor(
    private val apiClient: ApiClient,
    private val whDao: WhDao
) : IWhRepository {

    override suspend fun getWhList(): List<SimpleWh> {
        try {
            val list = apiClient.getWhList()
            whDao.insertAll(list)
            return list
        } catch (e: Exception) {
            return whDao.getAll()
        }
    }
}