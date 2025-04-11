import java.io.File

fun saveToCsv(data: List<StatePopulation>, path: String) {
    val file = File(path)
    file.printWriter().use { writer ->
        writer.println("State,Population")
        data.forEach {
            writer.println("${it.state},${it.population}")
        }
    }
    println("✅ File saved to $path")
}
