package ru.flatstack.sample.entities

class Container(
    val uuid: String,
    val name: String,
    val type: String,
    val volume: Float,
    val tkoCountKg: Float,
    val length: Float,
    val width: Float,
    val height: Float,
    val containerWeight: Float,
    val containerType: String,
    val state: String,
    val isUnique: Boolean,
    val startDate: Long?,
    val endDate: Long?,
    val flowersType: String,
    val comment: String?,
    val isTrouble: Boolean?,
    val media: List<WhMedia>?
)