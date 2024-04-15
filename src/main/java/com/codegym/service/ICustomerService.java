package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface ICustomerService {
    public List<Customer> findAll() throws Exception;
    public Customer findOne(Long id) throws Exception;

}
