class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
    
    // Constructor for Employee
    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;
    }
}

class Manager extends Member {
    String department;
    
    // Constructor for Manager
    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("John Doe", 30, "1234567890", "123 Main St", 50000.0, "Software Engineering");
        
        // Creating a Manager object
        Manager mgr = new Manager("Jane Smith", 35, "9876543210", "456 Park Ave", 80000.0, "Engineering");

        // Printing details and salary of the Employee
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone Number: " + emp.phoneNumber);
        System.out.println("Address: " + emp.address);
        System.out.println("Specialization: " + emp.specialization);
        emp.printSalary();
        System.out.println();
        
        // Printing details and salary of the Manager
        System.out.println("Manager Details:");
        System.out.println("Name: " + mgr.name);
        System.out.println("Age: " + mgr.age);
        System.out.println("Phone Number: " + mgr.phoneNumber);
        System.out.println("Address: " + mgr.address);
        System.out.println("Department: " + mgr.department);
        mgr.printSalary();
    }
}
