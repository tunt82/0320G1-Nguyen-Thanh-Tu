package furama_resort.services;

import furama_resort.models.Customer;
import furama_resort.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    void saveCustomer(Customer customer);

    Page<Customer> findAllCustomer(Pageable pageable);
}
