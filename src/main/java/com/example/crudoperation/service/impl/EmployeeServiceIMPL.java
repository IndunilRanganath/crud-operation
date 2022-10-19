package com.example.crudoperation.service.impl;

import com.example.crudoperation.dto.EmployeeDTO;
import com.example.crudoperation.entity.Employee;
import com.example.crudoperation.repo.EmployeeRepo;
import com.example.crudoperation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service


public class EmployeeServiceIMPL implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;


    @Override
    public String addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(
                employeeDTO.getEmployeeID(),
                employeeDTO.getName(),
                employeeDTO.getAddress(),
                employeeDTO.getSalary(),
                employeeDTO.getContactNumber(),
                employeeDTO.getNic(),
                employeeDTO.isActiveState()
        );
        if(!employeeRepo.existsById(employeeDTO.getEmployeeID())){
            employeeRepo.save(employee);
            return "saved " + employee.getName();
        }else {
            System.out.println("Employee ID already exists.");
            return "Employee ID already exists.";
        }
    }
}
