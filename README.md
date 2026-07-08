# TestNG Demo

A simple Java project that demonstrates the use of the **TestNG Framework** for unit testing. This project includes a Calculator class and test cases to verify arithmetic operations using TestNG assertions.

## 📌 Features

- Unit testing using TestNG
- Calculator class implementation
- Test cases for:
  - Addition
  - Subtraction
  - Multiplication
  - Division
- Test execution and reporting

## 🛠️ Technologies Used

- Java
- TestNG 7.11.0
- Spring Tool Suite (STS)
- Git
- GitHub

## 📂 Project Structure

```
TestNGDemo
│
├── src
│   └── com
│       └── example
│           ├── Calculator.java
│           └── CalculatorTest.java
│
├── test-output
│
├── .classpath
├── .project
└── README.md
```

## ▶️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/vedikapawade/TestNGDemo.git
   ```

2. Open the project in Spring Tool Suite (STS) or Eclipse.

3. Ensure the TestNG plugin is installed.

4. Right-click **CalculatorTest.java**.

5. Select:

   ```
   Run As → TestNG Test
   ```

## ✅ Test Cases

| Test Method | Description | Expected Result |
|-------------|-------------|-----------------|
| testAdd() | Tests addition | Pass |
| testSubtract() | Tests subtraction | Pass |
| testMultiply() | Tests multiplication | Pass |
| testDivide() | Tests division | Pass |

## 📊 Sample Output

```
PASSED: testAdd
PASSED: testSubtract
PASSED: testMultiply
PASSED: testDivide

===============================================
Tests run: 4
Passes: 4
Failures: 0
Skips: 0
===============================================
```

## 👩‍💻 Author

**Vedika Vijay Pawade**

GitHub: https://github.com/vedikapawade
