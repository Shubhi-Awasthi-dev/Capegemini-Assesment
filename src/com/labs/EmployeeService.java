package com.labs;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeService {

    private List<Employee> employees;

    public EmployeeService() {
        this.employees = EmployeeRepository.getEmployees();
    }

    // 1. Calculate average salary
    public double calculateAverageSalary() {
        return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }

    // 2. Find employee with maximum salary in each department
    public Map<Department, Optional<Employee>> getMaxSalaryEmployeeByDepartment() {
        return employees.stream().filter(e -> e.getDepartment() != null).collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
    }

    // 3. Calculate total salary per department
    public Map<Department, Double> getTotalSalaryByDepartment() {
        return employees.stream().filter(e -> e.getDepartment() != null).collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
    }

    // 4. Display employee name and salary
    public void displayEmployeeNameAndSalary() {
        employees.stream().forEach(e -> System.out.println(e.getFirstName() + " " + e.getLastName() + " : " + e.getSalary()));
    }

    // 5. Sort by salary in descending order
    public List<Employee> sortEmployeesBySalaryDesc() {
        return employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
    }
}