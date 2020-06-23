package furama_resort.services.impl;

import furama_resort.models.Customer;
import furama_resort.repositorys.CustomerRepository;
import furama_resort.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void saveCustomer(Customer customer) {
        customer.setIs_delete(true);
        customer.user.setIs_delete(true);
        customerRepository.save(customer);
    }

    @Override
    public Page<Customer> findAllCustomer(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }
}
