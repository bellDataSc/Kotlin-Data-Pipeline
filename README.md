# Public Data Pipeline for Business Insights (Kotlin Edition)

This project is a Kotlin-based version of the original **Public Data Pipeline for Business Insights**.

It demonstrates how to build a lightweight data pipeline using only Kotlin — from fetching public data via API to saving and processing it locally. The pipeline uses real demographic data from IBGE (the Brazilian Institute of Geography and Statistics).

---

## 📌 Project Overview

This pipeline includes:

- 📡 **Data Extraction**: Fetches population data by state from the IBGE API.
- 🧹 **Data Transformation**: Parses and structures the data into a clean format.
- 💾 **Data Load**: Saves the data locally as a CSV file for further analysis or reporting.

---

## 🛠 Tech Stack

- **Kotlin** (JVM)
- **Standard Library I/O**
- **org.json** for lightweight JSON parsing
- Gradle for dependency and project management

---

## 📁 Project Structure

```
kotlin-data-pipeline/
├── src/
│   └── main/
│       └── kotlin/
│           ├── ExtractIBGE.kt       // Fetch data from IBGE API
│           ├── SaveCsv.kt           // Save results to CSV
│           └── Main.kt              // Pipeline entry point
├── data/
│   └── population_ibge.csv          // Output file
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

---

## 🚀 How to Run

Clone the project and run it using Gradle:

```bash
./gradlew run
```

The output will be saved at:

```
data/population_ibge.csv
```

---

## 📈 Example Output

```csv
State,Population
São Paulo,46000000
Minas Gerais,21000000
Rio de Janeiro,17000000
...
```

---

## ❓ Why Kotlin?

- ✅ Modern, concise, and safe syntax
- 🔗 Fully interoperable with the JVM and Java ecosystem
- 🚀 Ideal for scalable pipelines and microservices
- 🧠 A unique portfolio differentiator in a Python-dominant field

---

## 👤 Author

Made by Bel — data analyst and developer focused on public sector insights and scalable solutions.
