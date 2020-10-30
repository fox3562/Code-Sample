package ru.flatstack.sample.model.interactors

import ru.flatstack.sample.entities.SimpleWh
import ru.flatstack.sample.model.repository.IWhRepository
import javax.inject.Inject

class WhInteractor @Inject constructor(
    private val whRepository: IWhRepository
) {

    suspend fun getWhList(): List<SimpleWh> {
        return whRepository.getWhList()
    }
}