package ru.flatstack.sample.entities

class Schedule(
    val uuid: String,
    val whUuid: String,
    val operatorUuid: String,
    val state: String,
    val type: String,
    val daysOfMonth: List<Int>?,
    val daysOfWeek: List<Int>?,
    val dates: List<Long>?,
    val startTime: Long?,
    val endTime: Long?
)