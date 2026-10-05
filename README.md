# Employee Payroll Management System

A console-based **Employee Payroll Management System** developed using **Java**.

This project is created to practice and demonstrate important **Core Java and Object-Oriented Programming (OOP)** concepts through a practical payroll application.

## 🚀 Features

- Add new employees
- Prevent duplicate Employee IDs
- Support different employee types:
  - General Employee
  - Manager
  - Developer
- Calculate HRA
- Calculate DA
- Calculate Gross Salary
- Calculate Bonus
- Calculate Tax
- Calculate Net Salary
- Display all employees
- Search employee by ID
- Display total number of employees
- Menu-driven console interface

## 🛠️ Technologies Used

- Java
- Core Java
- Object-Oriented Programming
- Scanner
- Arrays

## 📚 Java Concepts Used

This project demonstrates:

- Encapsulation
- Inheritance
- Polymorphism
- Method Overriding
- Constructors
- Static Variables and Methods
- Final Variables
- Access Modifiers
- Arrays
- Loops
- If-Else
- Switch-Case
- Scanner for User Input
- Upcasting
- Dynamic Method Dispatch

## 👨‍💻 Employee Types

### General Employee
No additional bonus is provided.

### Manager
Manager receives a **20% bonus** based on basic salary.

### Developer
Developer receives a **15% bonus** based on basic salary.

## 💰 Salary Calculation

### HRA
```text
HRA = Basic Salary × 10 / 100
```

### DA
```text
DA = Basic Salary × 5 / 100
```

### Gross Salary
```text
Gross Salary = Basic Salary + HRA + DA
```

### Tax
If Gross Salary is ₹50,000 or more:

```text
Tax = Gross Salary × 10 / 100
```

Otherwise:

```text
Tax = 0
```

### Net Salary
```text
Net Salary = Gross Salary + Bonus - Tax
```

## ▶️ How to Run

1. Install Java JDK.
2. Clone this repository.
3. Open the project in Eclipse, IntelliJ IDEA, or VS Code.
4. Run:

```text
EmployeePayrollSystem.java
```

5. Follow the menu displayed in the console.

## 📋 Menu

```text
=== Employee Payroll System ===
1. Add Employee
2. Display All Employees
3. Search Employee by ID
4. Show Total Employees
5. Exit
```

## 🎯 Purpose of the Project

The main purpose of this project is to understand how Java OOP concepts can be combined to build a practical console-based application.

It also helped me practice:

- Creating classes and objects
- Using inheritance
- Implementing runtime polymorphism
- Working with arrays of objects
- Applying encapsulation
- Performing salary calculations
- Building a menu-driven Java application

## 🔮 Future Improvements

Possible improvements for future versions:

- Update employee details
- Delete employees
- Store employee data permanently using a database
- Add login/authentication
- Create a GUI
- Add MySQL database connectivity
- Generate salary slips
- Add employee departments and job roles

## 👤 Author

**Mohit Patil**

Java Beginner | BCA Student

---

⭐ If you find this project useful, feel free to star the repository!
