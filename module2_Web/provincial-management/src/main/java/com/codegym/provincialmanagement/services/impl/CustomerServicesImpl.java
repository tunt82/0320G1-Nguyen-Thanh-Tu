package com.codegym.provincialmanagement.services.impl;

import com.codegym.provincialmanagement.model.Customer;
import com.codegym.provincialmanagement.repository.CustomerRepository;
import com.codegym.provincialmanagement.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServicesImpl implements CustomerServices {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findByIdCustomer(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void removeCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
