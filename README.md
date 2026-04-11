## 📌 About the Project

This project performs simple data analysis on an anime dataset using Scala.

It helps you understand:

- File handling in Scala  
- Case classes  
- Working with collections (List, Map)  
- Basic data analysis techniques  

---

## 🛠️ Tech Stack

- Scala (2.13)  
- SBT (Scala Build Tool)  
- Java JDK (8 or above)  
- VS Code / IntelliJ IDEA  
- CSV Dataset  

---

## ⚙️ Prerequisites

Before running the project, install the following:

---

### ☕ Java JDK

Scala runs on JVM, so Java is required.

🔗 Download:
- https://adoptium.net/
- https://www.oracle.com/java/technologies/javase-downloads.html

✔ Check installation:
```bash
java -version
````

---

### 🟣 Scala (2.13)

🔗 Download:
[https://www.scala-lang.org/download/](https://www.scala-lang.org/download/)

✔ Check installation:

```bash
scala -version
```

---

### ⚙️ SBT (Scala Build Tool)

🔗 Download:
[https://www.scala-sbt.org/download.html](https://www.scala-sbt.org/download.html)

✔ Check installation:

```bash
sbt sbtVersion
```

---

### 💻 IDE (Optional)

* VS Code: [https://code.visualstudio.com/](https://code.visualstudio.com/)
* IntelliJ IDEA: [https://www.jetbrains.com/idea/](https://www.jetbrains.com/idea/)

---

## 📂 Project Structure

```
anime-analysis/
│
├── data/
│   └── anime.csv
│
├── screenshots/
│   └── output.png
│
├── src/
│   └── main/
│       └── scala/
│           └── example/
│               └── Hello.scala
│
├── build.sbt
├── README.md
```

---

## 🚀 How to Run

### 1️⃣ Clone the repository

```bash
git clone https://github.com/lookmohan/Anime-Analysis-Project_Scala.git
```

---

### 2️⃣ Move into project folder

```bash
cd Anime-Analysis-Project_Scala
```

---

### 3️⃣ Run the project

```bash
sbt run
```

✔ This will automatically:

* Compile the code
* Run the program

---

## 📸 Output

![Anime Analysis Output](https://github.com/lookmohan/Anime-Analysis-Project_Scala/issues/1?reload=1)

---

## 📊 Sample Output

```
Total Anime: 15
Average Rating: 8.57
Highest Rated Anime: Fullmetal Alchemist Brotherhood
Anime with rating > 8.5: Naruto, One Piece, Attack on Titan

Genre-wise Average Rating:
Action -> 8.5
Drama -> 8.7

Longest Anime: One Piece (1000 episodes)
Anime with episodes > 100: Naruto, One Piece, Bleach
```

---

## 🧠 What You Will Learn

* Reading CSV files in Scala
* Using case classes
* Data filtering and aggregation
* Working with Scala collections
* Basic data analysis workflow

---

## 🚀 Future Improvements

* Add charts / graphs
* Export data to JSON or Excel
* Add search functionality
* Build web dashboard
* Support multiple datasets

---

## 👨‍💻 Author

Mohanraj R

---

