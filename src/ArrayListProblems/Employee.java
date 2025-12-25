package ArrayListProblems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// The Employee class with name, age, and salary attributes
public class Employee {
    private String name;
    private int age;
    private double salary;

    // Constructor to initialize the employee details
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Override toString method for easy printing of employee details
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}


