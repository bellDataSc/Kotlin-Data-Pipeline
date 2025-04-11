fun main() {
    val data = fetchPopulationData()
    saveToCsv(data, "data/population_ibge.csv")
}
