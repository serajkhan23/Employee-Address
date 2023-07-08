package com.example.AddressEmployee.controller;



import com.example.AddressEmployee.model.onetoone.Employee;
import com.example.AddressEmployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("employee")
    public List<Employee> getAllEmployee(@PathVariable String employee) {
        return employeeService.getAllEmployee(employee);
    }

    @GetMapping("employee/id")
    public void getAllEmployeeById(@PathVariable Employee id) {
        employeeService.getAllEmployeeById(id);
    }

    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @PutMapping("employee/{id}")
    public void updateEmployeeById(@PathVariable Long employeeId, @RequestBody Employee employee) {
        employeeService.updateEmployeeById(employeeId, employee);
    }

    public void deleteEmployeeById(@PathVariable Long employeeId) {
         employeeService.deleteEmployeeById(employeeId);
    }
}

