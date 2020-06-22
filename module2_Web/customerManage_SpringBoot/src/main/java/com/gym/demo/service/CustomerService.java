package com.gym.demo.service;

import com.gym.demo.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllCustomer();
    void saveCustomer(Customer customer);
    Customer findCustomerById(Long id);
    void removeCustomer(Long id);
}
