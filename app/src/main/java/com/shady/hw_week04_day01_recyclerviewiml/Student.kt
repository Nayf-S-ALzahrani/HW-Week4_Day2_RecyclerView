package com.shady.hw_week04_day01_recyclerviewiml

import java.util.*

data class Student (
    val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: Date = Date(),
    var isPresent: Boolean = false)
