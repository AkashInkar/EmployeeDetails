package com.example.employee.dao;

import com.example.employee.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee getEmployee(int id);
    Employee saveEmployee(Employee theEmployee);
    void deleteEmp(int id);
}
