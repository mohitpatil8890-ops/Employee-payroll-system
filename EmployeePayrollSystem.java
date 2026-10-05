
package Payrollsy;

import java.util.Scanner;

class Empy {

    private int id;
    private String name;
    private double basicsalary;

    private static int totalEmployees = 0;

    final double HRA_RATE = 10;
    final double DA_RATE = 5;

    public Empy(int id, String name, double basicsalary) {
        this.id = id;
        this.name = name;
        this.basicsalary = basicsalary;
        totalEmployees++;
    }

    public int getid() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasicsalary() {
        return basicsalary;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public double calculateHra() {
        return basicsalary * HRA_RATE / 100;
    }

    public double calculateDA() {
        return basicsalary * DA_RATE / 100;
    }

    public double calculateGrosssalary() {
        return basicsalary + calculateHra() + calculateDA();
    }

    public double calculateTax() {
        if (calculateGrosssalary() >= 50000) {
            return calculateGrosssalary() * 10 / 100;
        }
        return 0;
    }

    public double calculateBonus() {
        return 0;
    }

    public double calculatenetsalary() {
        return calculateGrosssalary()
                + calculateBonus()
                - calculateTax();
    }

    public String getEmployeeType() {
        return "General Employee";
    }

    public void displayDetails() {
        System.out.println("\n----- Employee Payroll -----");
        System.out.println("ID            : " + id);
        System.out.println("Name          : " + name);
        System.out.println("Employee Type : " + getEmployeeType());
        System.out.println("Basic Salary  : " + basicsalary);
        System.out.println("HRA           : " + calculateHra());
        System.out.println("DA            : " + calculateDA());
        System.out.println("Gross Salary  : " + calculateGrosssalary());
        System.out.println("Bonus         : " + calculateBonus());
        System.out.println("Tax           : " + calculateTax());
        System.out.println("Net Salary    : " + calculatenetsalary());
    }
}

class Manager extends Empy {

    public Manager(int id, String name, double basicsalary) {
        super(id, name, basicsalary);
    }

    @Override
    public double calculateBonus() {
        return getBasicsalary() * 20 / 100;
    }

    @Override
    public String getEmployeeType() {
        return "Manager";
    }
}

class Developer extends Empy {

    public Developer(int id, String name, double basicsalary) {
        super(id, name, basicsalary);
    }

    @Override
    public double calculateBonus() {
        return getBasicsalary() * 15 / 100;
    }

    @Override
    public String getEmployeeType() {
        return "Developer";
    }
}

public class EmployeePayrollSystem {

    private static final int MAX_EMPLOYEE = 100;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Empy[] employee = new Empy[MAX_EMPLOYEE];

        int count = 0;

        while (true) {

            System.out.println("\n=== Employee Payroll System ===");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Show Total Employees");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (count >= MAX_EMPLOYEE) {
                        System.out.println("Storage full!");
                        break;
                    }

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    boolean exists = false;

                    for (int i = 0; i < count; i++) {
                        if (employee[i].getid() == id) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("ID already exists!");
                        break;
                    }

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double salary = sc.nextDouble();

                    if (salary <= 0) {
                        System.out.println("Invalid salary!");
                        break;
                    }

                    System.out.println("1. General Employee");
                    System.out.println("2. Manager");
                    System.out.println("3. Developer");
                    System.out.print("Select type: ");

                    int type = sc.nextInt();

                    Empy emp;

                    switch (type) {

                        case 1:
                            emp = new Empy(id, name, salary);
                            break;

                        case 2:
                            emp = new Manager(id, name, salary);
                            break;

                        case 3:
                            emp = new Developer(id, name, salary);
                            break;

                        default:
                            System.out.println("Invalid type!");
                            continue;
                    }

                    employee[count] = emp;
                    count++;

                    System.out.println("Employee added successfully!");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No employees found!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            employee[i].displayDetails();
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (employee[i].getid() == searchId) {
                            employee[i].displayDetails();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found!");
                    }
                    break;

                case 4:

                    System.out.println(
                        "Total Employees: "
                        + Empy.getTotalEmployees()
                    );
                    break;

                case 5:

                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice!");
            }
        }
    }
}
