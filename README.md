## 📖 Description

This project reads anime data from a CSV file and performs simple data analysis using Scala.

It is a beginner-friendly project to understand:

* File handling in Scala
* Case classes
* Working with collections (List, Map)
* Basic data analysis

---

## 🛠️ Technologies Used

* Scala (2.13)
* SBT (Scala Build Tool)
* Visual Studio Code (VS Code)
* CSV file (dataset)

---

## 📂 Project Structure

```
anime-analysis/
│
├── data/
│   └── anime.csv
│
├── src/
│   └── main/
│       └── scala/
│           └── example/
│               └── Hello.scala
│
├── build.sbt
```

---

## 📊 Dataset

The dataset contains anime details such as:

* id
* name
* genre
* episodes
* rating

---

## ⚙️ Features / Operations

The program performs the following operations:

1. Calculate total number of anime
2. Calculate average rating
3. Find highest rated anime
4. Filter anime with rating greater than 8.5
5. Calculate genre-wise average rating
6. Find anime with highest number of episodes
7. Filter anime with episodes greater than 100

---

## ▶️ How to Run the Project

### Step 1: Clone the repository

```
git clone <your-repo-link>
```

### Step 2: Navigate to project folder

```
cd anime-analysis
```

### Step 3: Run the project

```
sbt run
```

---

## 📌 Sample Output

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

## 🧠 Learning Outcomes

After completing this project, you will be able to:

* Read data from CSV files in Scala
* Use case classes for structured data
* Perform data filtering and aggregation
* Work with Scala collections effectively

---

## 🏷️ Tags

Scala, SBT, Data Analysis, CSV, Beginner Project, File Handling

---

## 👩‍💻 Author

Vaishnavi R

---
