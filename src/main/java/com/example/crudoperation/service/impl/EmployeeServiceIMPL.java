package com.example.crudoperation.service.impl;

import com.example.crudoperation.dto.EmployeeDTO;
import com.example.crudoperation.entity.Employee;
import com.example.crudoperation.repo.EmployeeRepo;
import com.example.crudoperation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public String updateEmployee(EmployeeDTO employeeDTO) {
        if(employeeRepo.existsById(employeeDTO.getEmployeeID())){
            Employee employee = employeeRepo.getById(employeeDTO.getEmployeeID());
            employee.setName(employeeDTO.getName());
            employee.setAddress(employeeDTO.getAddress());
            employee.setSalary(employeeDTO.getSalary());
            employee.setContactNumber(employeeDTO.getContactNumber());
            employee.setNic(employeeDTO.getNic());
            employee.setActiveState(employeeDTO.isActiveState());

            employeeRepo.save(employee);
            return "Updated";

        }else{
            System.out.println("No employee found for that ID.");
            return "No employee found for that ID.";
        }
    }

    @Override
    public EmployeeDTO getEmployeeByID(int employeeID) {
        Optional<Employee> employee = employeeRepo.findById(employeeID);
        if(employee.isPresent()){
            EmployeeDTO employeeDTO = new EmployeeDTO(
              employee.get().getEmployeeID(),
              employee.get().getName(),
              employee.get().getAddress(),
              employee.get().getSalary(),
              employee.get().getContactNumber(),
              employee.get().getNic(),
              employee.get().isActiveState()
            );
            return employeeDTO;
        }else {
            return null;
        }
    }

    @Override
    public String deleteEmployee(int employeeID) {
        if (employeeRepo.existsById(employeeID)){
            employeeRepo.deleteById(employeeID);
            return "Deleted.";
        }else {
            return "No Employee found for this ID.";
        }
    }
}
