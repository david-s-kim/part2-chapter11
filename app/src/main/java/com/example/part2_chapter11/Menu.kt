package com.example.part2_chapter11

import android.view.MenuItem

data class Menu(

    val coffee: List<MenuItem>,
    val food: List<MenuItem>,
)

data class MenuItem(
    val image: String,
    val name: String,
)