package ru.app.healer.data.dto

data class Episode(
    val id: Int,
    val name: String,
    val duration: String = "23 Oct 2021 - 1 Nov 2021", //must be of type Data or something in future, and non-null
    val patient: String? = null //must be of type Patient, and non-null
)