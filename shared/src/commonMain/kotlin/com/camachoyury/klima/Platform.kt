package com.camachoyury.klima

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform