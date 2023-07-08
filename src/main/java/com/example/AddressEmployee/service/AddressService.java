package com.example.AddressEmployee.service;

import com.example.AddressEmployee.model.onetoone.Address;
import com.example.AddressEmployee.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;
    public List<Address> getAllAddress(String address) {

        return iAddressRepo.findAllByAddress(address);
    }

    public  List<Address> getAllAddressId(Address  Id) {
        return  iAddressRepo.findAllAddressById(Id);
    }

    public Address addAddress(Address address) {
        return iAddressRepo.save(address);
    }

    public boolean updateAddressById(Long addressId, Address address) {
        if (iAddressRepo.existsById(addressId)) {
            iAddressRepo.deleteById(addressId);
            return true;
        }
        return false;
    }

    public void deleteAddressById(Long addressId) {
    }
}
