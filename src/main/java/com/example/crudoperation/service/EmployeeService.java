package com.example.crudoperation.service;

import com.example.crudoperation.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);

    String updateEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO getEmployeeByID(int employeeID);


    String deleteEmployee(int employeeID);
}
