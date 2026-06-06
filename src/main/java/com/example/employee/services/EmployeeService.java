package com.example.employee.services;

import com.example.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee getEmployee(int id);
    Employee saveEmployee(Employee theEmployee);
    void deleteEmp(int id);
}
