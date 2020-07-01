package furama_resort.services;

import furama_resort.models.Customer;
import furama_resort.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.sql.Date;
import java.util.List;

public interface CustomerService {
    void saveCustomerById(Long id);
    void saveCustomer(Customer customer);

    Page<Customer> findAllCustomer(Pageable pageable,String s, String type);

    void deleteCustomerById(Long id);

    Customer findCustomerById(Long id);

    List<Customer> getAllCustomer();

    Page<Customer>findAllCustomerUseService(Date s, Date e, Pageable pageable);

}
