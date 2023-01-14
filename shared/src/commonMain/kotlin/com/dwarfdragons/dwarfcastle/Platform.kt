package com.dwarfdragons.dwarfcastle

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform