package Baitap.java13.service;

import Baitap.java13.Employee;
import Baitap.java13.Experience;
import Baitap.java13.Fresher;
import Baitap.java13.Intern;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public void insert(Employee employee) {
        this.employees.add(employee);
    }

    public Employee findById(int id) {
        List<Employee> employees = findAll();
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }

        }
        return null;
    }


    public boolean deleteById(int id) {
        Employee employee = this.findById(id);
        if (employee == null) {
            return false;
        }
        this.employees.remove(employee);
        return true;
    }

    /**
     * type = 0 => Experience
     * type = 1 => Fresher
     * type = 2 => Intern
     */
    public List<Employee> findByType(int type) {
        return this.employees.stream()
                .filter(employee -> {
                    if (type == 0) {
                        return employee instanceof Experience;
                    }
                    if (type == 1) {
                        return employee instanceof Fresher;
                    }
                    if (type == 2) {
                        return employee instanceof Intern;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }

    public List<Employee> findAll() {
        return this.employees;
    }

}
