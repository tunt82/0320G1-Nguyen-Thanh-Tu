package province_manage.service;

import province_manage.model.Customer;
import province_manage.model.User;

import java.util.List;

public interface CustomerService {
    void saveCustomer(Customer customer);

    List<Customer> findAllCustomer();
}
