import com.bonespirito.packageregistry.LogTracing

fun main(args: Array<String>) {
    val l = LogTracing()
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val a = l.getUUID()

    println(a)
}
