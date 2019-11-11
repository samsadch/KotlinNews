package com.example.kotlinnews.network

data class ModelResponse(
    val `data`: Data,
    val kind: String?
)

data class Data(
    val after: String?,
    val before: String?,
    val children: List<Children>,
    val dist: Int?,
    val modhash: String?
)

