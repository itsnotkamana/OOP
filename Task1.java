package tutorial;

public class Task1 {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Adding employees
        manager.addEmployee(new Employee(1, "Alice", "Manager", 75000));
        manager.addEmployee(new Employee(2, "Bob", "Developer", 60000));
        manager.addEmployee(new Employee(3, "Charlie", "Designer", 55000));

        // Display employee information
        System.out.println("Employee List:");
        manager.displayEmployees();
    }
}





