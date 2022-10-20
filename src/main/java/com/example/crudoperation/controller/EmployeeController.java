package com.example.crudoperation.controller;

import com.example.crudoperation.dto.EmployeeDTO;
import com.example.crudoperation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/employee")
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO){
        String id = employeeService.addEmployee(employeeDTO);
        return id;
    }

//    @PutMapping(path = "/update")
//    public String updateEmployee(@RequestBody EmployeeDTO employeeDTO){
//        String update = employeeService.updateEmployee(employeeDTO);
//        return update;
//    }
    @GetMapping(
            path = "get-by-id",
            params = "id"
    )
    public EmployeeDTO getEmployeeByID(@RequestParam(value = "id") int employeeID){
        EmployeeDTO employeeDTO = employeeService.getEmployeeByID(employeeID);
        return employeeDTO;
    }




}
