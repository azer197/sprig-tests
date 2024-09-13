package com.QuickClaim.NetHelp.Service;

import com.QuickClaim.NetHelp.DAO.EmployeeRepository;
import com.QuickClaim.NetHelp.Models.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public EmployeeService() {}

    public List<Employee> getAllEmployees(){return employeeRepository.findAll();}
    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    @Transactional
    public void deleteEmployee(Long id){
        employeeRepository.deleteEmployeeById(id);
    }
}
