import platform.AppKit.*
import platform.posix.usleep

fun main() {
    val performer = NSHapticFeedbackManager.defaultPerformer()

    println("Touch the trackpad (Ctrl+C to exit)...")
    while (true) {
        performer.performFeedbackPattern(NSHapticFeedbackPatternGeneric, NSHapticFeedbackPerformanceTimeNow)
        usleep(5000)
    }
}