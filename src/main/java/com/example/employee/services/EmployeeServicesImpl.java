package com.example.employee.services;

import com.example.employee.dao.EmployeeDAO;
import com.example.employee.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class EmployeeServicesImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

  public   EmployeeServicesImpl(){

    }

    @Autowired
    private EmployeeServicesImpl(EmployeeDAO theEmployeeDAO){
        this.employeeDAO = theEmployeeDAO;

    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }

    @Transactional
    @Override
    public Employee saveEmployee(Employee theEmployee) {
       employeeDAO.saveEmployee(theEmployee);
        return theEmployee;
    }

   // @Transactional
    @Override
    public void deleteEmp(int id) {
        employeeDAO.deleteEmp(id);
    }
}
