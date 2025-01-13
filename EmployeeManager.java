package tutorial;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;

    // Constructor
    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    // Add employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Display employees
    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}




