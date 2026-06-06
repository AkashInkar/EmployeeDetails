package com.example.employee.controller;

import com.example.employee.dao.EmployeeDAO;
import com.example.employee.entity.Employee;
import com.example.employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    @GetMapping("/employee")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        Employee theEmployee = employeeService.getEmployee(employeeId);
        if (theEmployee == null){
            throw new RuntimeException("Employee not found");
        } else {
            return  employeeService.getEmployee(employeeId);
        }
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee theEmployee){
        theEmployee.setId(7);
        Employee dbEmployee = employeeService.saveEmployee(theEmployee);

        return dbEmployee;
    }
}
