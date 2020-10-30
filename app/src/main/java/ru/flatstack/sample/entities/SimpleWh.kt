package ru.flatstack.sample.entities

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class SimpleWh(
    @PrimaryKey
    @NonNull
    val uuid: String,
    //todo val address: FiasAddress?,
    val latitude: Float?,
    val longitude: Float?,
    //todo val owner: Owner?
)
