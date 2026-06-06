package com.example.employee.dao;

import com.example.employee.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{


    private EntityManager entityManager;
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }


    @Override
    public List<Employee> findAll() {

        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee",Employee.class);

        List<Employee> employees = theQuery.getResultList();


        return employees;
    }

    @Override
    public Employee getEmployee(int id) {
        Employee theEmployee = entityManager.find(Employee.class,id);
        return theEmployee;
    }

    @Override
    public Employee saveEmployee(Employee theEmployee) {
      // Employee dbEmployee = entityManager.merge(theEmployee);
        Employee dbEmployee = entityManager.merge(theEmployee);

        return dbEmployee;
    }

    @Override
    public void deleteEmp(int id) {
     Employee deleteEmp = entityManager.find(Employee.class,id);
     entityManager.remove(deleteEmp);
    }
}
