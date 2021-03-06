package codeGym.service;


import codeGym.models.Customer;

import java.util.List;

public interface CustomerServive {
    List<Customer> findAll();
    void save(Customer customer);
    Customer findById(int id);
    void update(int id, Customer customer);
    void remove(int id);

}
