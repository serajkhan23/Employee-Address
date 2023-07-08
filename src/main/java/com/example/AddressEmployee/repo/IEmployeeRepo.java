package com.example.AddressEmployee.repo;


import com.example.AddressEmployee.model.onetoone.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepo extends CrudRepository<Employee,Long> {
    List<Employee> findAllEmployee(String employee);

    List<Employee> findAllEmployeeById(Long id);
}
