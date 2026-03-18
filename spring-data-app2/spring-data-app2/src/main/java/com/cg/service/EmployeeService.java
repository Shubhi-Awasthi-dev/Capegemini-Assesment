package com.cg.service;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private IEmployeeRepo erepo;
    public String createEmployee(Employee emp){
        erepo.saveAndFlush(emp);
        return "Employee created successfully"+emp.getEmpId();


    }
    public List<Employee> getAllEmployees(){
        return erepo.findAll();
    }
    public Employee getEmployeeById(int empId){
        return erepo.findById(empId).orElse(null);
    }
    public String removeEmployeeById(int empId){
        if(getEmployeeById(empId) != null){
            erepo.deleteById(empId);
            return "Employee removed successfully " + empId;
        } else{
            return "Employee not found with id " + empId;
        }
    }

    public String updateEmployee(Employee emp){
        erepo.saveAndFlush(emp);
        return "Employee updated successfully " + emp.getEmpId();
    }
}