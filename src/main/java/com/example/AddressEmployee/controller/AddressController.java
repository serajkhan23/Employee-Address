package com.example.AddressEmployee.controller;

import com.example.AddressEmployee.model.onetoone.Address;
import com.example.AddressEmployee.service.AddressService;


import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping("addressess")
    public List<Address> getAllAddress(@PathVariable String address)
    {
        return  addressService.getAllAddress(address);
    }
    @GetMapping("address/id")
    public void getAllAddressById(@PathVariable Address id)
    {
        addressService.getAllAddressId(id);
    }
    public void addAddress(@RequestBody Address address)
    {
        addressService.addAddress(address);
    }
    @PutMapping("address/{id}")
    public void updateAddressById(@PathVariable Long addressId,  @RequestBody Address address)
    {
        addressService.updateAddressById( addressId,address);
    }
    public void deleteAddressById(@PathVariable Long addressId)
    {

    }
}
