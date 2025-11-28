class Employee {
    String name;
    int empId;

    // Constructor
    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
    }
}

// Child Class (inherits Employee)
class Salary extends Employee {
    double basicSalary;
    double bonus;

    Salary(String name, int empId, double basicSalary, double bonus) {
        super(name, empId); // calling parent constructor
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    double calculateTotalSalary() {
        return basicSalary + bonus;
    }

    void displaySalaryDetails() {
        displayEmployeeInfo();  // calling parent method
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}

public class Main {
    public static void main(String[] args) {

        Salary s1 = new Salary("John Doe", 101, 50000, 8000);

        s1.displaySalaryDetails();
    }
}
