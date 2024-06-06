public class MainActivity {
    public static void main(String[] x) {
        // Creating an Employee object and calling its methods
        Employee emp = new Employee("uttam chhatrola", 21, "9890562346", "123 Elm Street", 50000.0, "Software Engineering");
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Phone Number: " + emp.getPhoneNumber());
        System.out.println("Address: " + emp.getAddress());
        emp.printSalary();
        System.out.println("Specialization: " + emp.specialization);

        // Creating a Manager object and calling its methods
        Manager mgr = new Manager("harsh patel", 21, "8160590035", "456 Oak Avenue", 75000.0, "Human Resources");
        System.out.println("\nManager Details:");
        System.out.println("Name: " + mgr.getName());
        System.out.println("Age: " + mgr.getAge());
        System.out.println("Phone Number: " + mgr.getPhoneNumber());
        System.out.println("Address: " + mgr.getAddress());
        mgr.printSalary();
        System.out.println("Department: " + mgr.department);
    }
}