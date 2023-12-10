package ai.mywave.kotlinmultiplatformjs

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform