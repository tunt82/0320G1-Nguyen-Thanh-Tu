package com.codegym.provincialmanagement.services;

import com.codegym.provincialmanagement.model.Customer;

public interface CustomerServices {
    Iterable<Customer> findAllCustomer();

    Customer findByIdCustomer(Long id);

    void saveCustomer(Customer customer);

    void removeCustomer(Long id);
}
