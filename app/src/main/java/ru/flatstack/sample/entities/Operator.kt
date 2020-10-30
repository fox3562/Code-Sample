package ru.flatstack.sample.entities

class Operator(
    val uuid: String,
    val documentUuid: String,
    val startDate: Long,
    val endDate: Long,
    val registryObject: RegistryObject,
    val lawFullname: String,
    val orgn: String,
    val inn: String,
    val lawAddress: String?,
    val email: String?,
    val phone: String?
)
