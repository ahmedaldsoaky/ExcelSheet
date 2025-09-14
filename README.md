# 📊 Excel Sheet Simulator

A simple console-based **Excel Sheet Simulator** built in Java.  
It mimics basic spreadsheet behavior using **2D arrays**, allowing users to set cell values, perform arithmetic operations, and clear cells.  

---

## ✨ Features
- Represent an Excel-like sheet with rows and columns.
- Perform operations like **addition, subtraction, multiplication, division**.
- Update cells dynamically when referenced in other operations.
- Handle invalid inputs gracefully with error messages.
- Simple text-based interface for easy interaction.

---

## 📂 Project Structure
ExcelSheet/
├── src/
│ ├── ExcelSheet.java # main entry point
│ ├── ExcelClass.java # helper class for cell operations
├── output/
│ └── Output.png # screenshot/sample output
├── README.md # this file

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) — version 8 or above
- A terminal / command-line tool
- Basic familiarity with compiling and running Java programs


### 🧪Example Usage
Operation	Input / Command	Output / Behavior
Set value	A1 = 5	Cell A1 is updated to 5
Add two cells	A2 = A1 + 10	A2 becomes 15
Clear a cell	clear A1	A1 becomes empty
Invalid input	B1 = Apple	Error: invalid input, expecting number

📷 Also see Output.png for a sample screenshot.

### ⚙️ Design Decisions & Challenges
- 2D arrays chosen for simplicity (fixed rows/columns).

- Encapsulation: ExcelClass.java manages parsing, operations, and validation.

- Reference parsing: e.g., converting B2 → correct row/column indices.

### 🧩 Possible Improvements
- Support formulas (e.g., SUM(A1:A5), AVERAGE, etc.).

- Dynamic resizing of rows/columns.

- Save/load sheet state (serialization).

- Add GUI (JavaFX/Swing) or a web frontend.

- Better error handling and unit tests.

- Performance optimizations for large sheets.

### 👤 Author
Ahmed Aldsoaky
Computer Engineering Student, Al-Azhar University
