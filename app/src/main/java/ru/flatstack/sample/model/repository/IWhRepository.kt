package ru.flatstack.sample.model.repository

import ru.flatstack.sample.entities.SimpleWh

interface IWhRepository {

    suspend fun getWhList(): List<SimpleWh>
}