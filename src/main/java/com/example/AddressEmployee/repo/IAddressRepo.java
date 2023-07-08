package com.example.AddressEmployee.repo;

import com.example.AddressEmployee.model.onetoone.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Long> {
    List<Address> findAllByDate(String address);

    List<Address> findAllByAddress(String address);

    List<Address> findAllAddressById(String id);
}
