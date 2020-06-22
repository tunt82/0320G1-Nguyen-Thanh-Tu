package com.gym.demo.service.impl;

import com.gym.demo.model.Customer;
import com.gym.demo.repository.CustomerRepository;
import com.gym.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
 public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void removeCustomer(Long id) {
        customerRepository.remove(id);
    }
}
