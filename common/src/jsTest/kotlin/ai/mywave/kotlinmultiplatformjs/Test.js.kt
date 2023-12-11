package ai.mywave.kotlinmultiplatformjs

import kotlin.test.Test
import kotlin.test.assertTrue

class JSGreetingTest {

    @Test
    fun testExample() {
        assertTrue("Check Web is mentioned", Greeting().greet().contains("Web"))
    }
}
