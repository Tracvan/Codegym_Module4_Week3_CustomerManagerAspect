package com.codegym.service;

import com.codegym.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerService implements ICustomerService{
    List<Customer> customers = new ArrayList<>();
    @Override
    public List<Customer> findAll() throws Exception {
        throw new Exception("a dummy exception");
    }

    @Override
    public Customer findOne(Long id) throws Exception {
        Customer customer = new Customer();
        if (customer.getName() == null) {
            throw new Exception("customer not found!");
        }
        return customer;
    }
}
