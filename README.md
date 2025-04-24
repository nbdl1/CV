# 🧑‍💼 CV Generator (Java Console App)

A simple Java console application that models a professional CV and prints it out in a storytelling format, with typing animation and multilingual support (EN/RU).

---

## 📌 Features

- Prints personal data, work experience, education, and projects
- Simulates typing with per-character delay
- Supports both English and Cyrillic content
- Demonstrates object-oriented structure (Person, Job, Education, etc.)
- Formats dates and handles internationalization

---

## 📦 Technologies

- Java SE
- `Calendar`, `DateFormat` for date management
- Unicode and Cyrillic output support in console
- OOP principles: inheritance, encapsulation, composition

---

## 📂 Project Structure

- `Main` – entry point
- `Sergey` – subclass of `Main.Man` with customized CV
- `Job`, `Education`, `Project` – models for CV elements
- `PrintStoryString` – handles animated console output

---

## ▶️ How to Run

```bash
javac Main.java
java -Dfile.encoding=UTF-8 Main
