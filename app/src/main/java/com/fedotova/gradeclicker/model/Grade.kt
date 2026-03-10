package com.fedotova.gradeclicker.model

import androidx.annotation.DrawableRes

data class Grade(
    @DrawableRes val imageId: Int,
    val pointsPerClick: Int,
    val threshold: Int
)