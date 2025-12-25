package ArrayListProblems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // 1. Create a list to store Employee objects
        List<Employee> employees = new ArrayList<>();

        // 2. Add employee details
        employees.add(new Employee("Alice", 30, 75000.00));
        employees.add(new Employee("Bob", 45, 90000.00));
        employees.add(new Employee("Charlie", 28, 60000.00));
        employees.add(new Employee("David", 35, 120000.00));

        // 3. List all employees
        System.out.println("--- List of all employees: ---");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // 4. Find the employee with the highest salary
        findHighestSalaryEmployee(employees);
    }

    // Method to find the employee with the highest salary
    public static void findHighestSalaryEmployee(List<Employee> employees) {
        if (employees.isEmpty()) {
            System.out.println("\nNo employees in the list.");
            return;
        }

        // Using Java 8 streams for efficient finding of the maximum salary employee
        Optional<Employee> highestPaidEmployee = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));

        System.out.println("\n--- Employee with the highest salary: ---");
        // Check if an employee was found and print their details
        if (highestPaidEmployee.isPresent()) {
            System.out.println(highestPaidEmployee.get());
        } else {
            System.out.println("Could not find the highest paid employee.");
        }
    }
}
