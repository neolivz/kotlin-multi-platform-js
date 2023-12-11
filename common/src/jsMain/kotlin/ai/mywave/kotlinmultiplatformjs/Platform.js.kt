
package ai.mywave.kotlinmultiplatformjs

class JSPlatform : Platform {
    override val name: String = "World Wide Web"
}

actual fun getPlatform(): Platform = JSPlatform()
