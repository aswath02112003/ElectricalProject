package com.example.controller;

import com.example.Service.CustomerService;
import com.example.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CustomerController {
    @Autowired
    private CustomerService service;
    @GetMapping("/getCustomerById/{id}")
    public Customer getCustomerById(@PathVariable int id){
        return service.getCustomerById(id);
    }
    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        return service.addCustomer(customer);
    }
    @PutMapping("/updateCustomer")
    public Customer updateCustomer(@RequestBody Customer customer){
        return service.updateCustomer(customer);
    }


}
