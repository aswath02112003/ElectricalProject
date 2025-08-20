package com.example.Service;

import com.example.model.Customer;
import com.example.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo repo;


    public Customer addCustomer(Customer customer) {
        return repo.save(customer);
    }

    public Customer updateCustomer(Customer customer) {
        return repo.save(customer);
    }

    public Customer getCustomerById(int customerId) {
        return repo.getCustomersByCustomerId(customerId);
    }
}
