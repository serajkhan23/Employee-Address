package com.example.AddressEmployee.model.onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Employee {
    private Long id;
    private String firstname;
    private String lastname;
    private String address;

    @OneToOne
    @JoinColumn(name = "fk_employee_id")
    Employee employee;

}
