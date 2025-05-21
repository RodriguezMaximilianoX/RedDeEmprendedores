package com.rmxdev.reddeemprendedores.domain.entities

data class User(
    val id: String,
    val fullName: String,
    val dni: String,
    val bornDate: String,
    val address: String,
    val phone: String,
    val email: String,
    val isSuscriber: Boolean = false
)