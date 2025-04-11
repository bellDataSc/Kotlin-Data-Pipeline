import java.net.HttpURLConnection
import java.net.URL
import org.json.JSONArray

data class StatePopulation(val state: String, val population: String)

fun fetchPopulationData(year: String = "2021"): List<StatePopulation> {
    val url = URL("https://servicodados.ibge.gov.br/api/v3/agregados/6579/periodos/$year/variaveis/9324?localidades=N1[all]")
    val connection = url.openConnection() as HttpURLConnection
    connection.requestMethod = "GET"

    val response = connection.inputStream.bufferedReader().readText()
    val jsonArray = JSONArray(response)

    val series = jsonArray
        .getJSONObject(0)
        .getJSONArray("resultados")
        .getJSONObject(0)
        .getJSONArray("series")

    return List(series.length()) { i ->
        val item = series.getJSONObject(i)
        val state = item.getJSONObject("localidade").getString("nome")
        val population = item.getJSONObject("serie").getString(year)
        StatePopulation(state, population)
    }
}
