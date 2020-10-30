package ru.flatstack.sample.entities

class FlowersSource(
    val uuid: String,
    val name: String,
    val type: String,
    val cadastralNumber: String,
    val address: FiasAddress,
    val latitude: Float,
    val longitude: Float,
    val category: String,
    val subCategory: String,
    val unitType: String,
    val altUnitType: String,
    val standartUuid: String,
    val tkoCountKg: Float,
    val tkoCountM3: Float
)