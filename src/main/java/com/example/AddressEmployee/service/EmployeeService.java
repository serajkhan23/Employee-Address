package com.example.AddressEmployee.service;

import com.example.AddressEmployee.model.onetoone.Employee;
import com.example.AddressEmployee.repo.IAddressRepo;
import com.example.AddressEmployee.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo iEmployeeRepo;
    public List<Employee> getAllEmployee(String employee) {
        return iEmployeeRepo.findAllEmployee(employee);

    }

    public  List<Employee> getAllEmployeeById(Employee employeeid) {
        return  iEmployeeRepo.findAllEmployeeById(employeeid);
    }

    public void addEmployee(Employee employee) {
        iEmployeeRepo.save(employee);
    }

    public boolean updateEmployeeById(Long employeeId, Employee employee) {
        if (iEmployeeRepo.existsById(employeeId)) {
            iEmployeeRepo.deleteById(employeeId);
            return true;
        }
        return false;
    }

    public void deleteEmployeeById(Long Employee) {
      //return  iEmployeeRepo.delete(id);

    }
}
