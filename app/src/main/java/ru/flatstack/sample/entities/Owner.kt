package ru.flatstack.sample.entities

class Owner(
    val uuid: String,
    val registryObject: RegistryObject,
    val type: String,
    val ownerName: String,
    val ogrn: String,
    val inn: String,
    val fullName: String,
    val registerAddress: String,
    val lawAddress: String,
    val factAddress: String,
    val passport: Passport,
    val email: String?,
    val phone: String?
)