package ru.flatstack.sample.entities

class Wh(
    val uuid: String,

    val address: FiasAddress?,
    val latitude: Float,
    val longitude: Float,
    val params: Params,
    val containers: List<Container>,
    val state: String,
    val startDate: Long,

    val owner: Owner?,
    val operator: Operator?,
    val schedule: Schedule?,
    val flowersSource: FlowersSource?,
    val regOperator: RegOperator?,

    val registryState: String,
    val terrSchemeUuid: String,
    val placeSchemeUuid: String
)
