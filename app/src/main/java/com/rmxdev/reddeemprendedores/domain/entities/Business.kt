package com.rmxdev.reddeemprendedores.domain.entities

data class Business(
    val id: String,
    val ownerId: String,
    val title: String,
    val description: String,
    val imageUrl: String,
    val category: String,
    val location: String,
    val schedules: List<BusinessSchedule>,     // Formerly "horarios"
    val paymentMethods: List<PaymentMethod>,   // Formerly "medios de pago"
)

data class BusinessSchedule(
    val dayOfWeek: String,   // e.g., "Monday", "Tuesday"
    val openHour: String,    // e.g., "09:00"
    val closeHour: String    // e.g., "18:00"
)

data class PaymentMethod(
    val name: String,         // e.g., "Cash", "Bank Transfer", "Credit Card"
    val isAccepted: Boolean   // true if the business accepts it
)