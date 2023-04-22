package com.debug.competition

import androidx.annotation.DrawableRes

data class Item (
    val title: String,
    val description: String,
    @DrawableRes val icon: Int
)