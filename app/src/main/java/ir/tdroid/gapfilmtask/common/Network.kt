package ir.tdroid.gapfilmtask.common

import kotlinx.coroutines.delay
import java.io.IOException

suspend fun <T> retryIO(
    times: Int = 3,
    delay: Long = 1000,    // 1 second
    block: suspend () -> T): T
{
    repeat(times - 1) {
        try {
            return block()
        } catch (e: IOException) {
            e.printStackTrace()
            // you can log an error here and/or make a more finer-grained
            // analysis of the cause to see if retry is needed
        }
        delay(delay)
    }
    return block() // last attempt
}