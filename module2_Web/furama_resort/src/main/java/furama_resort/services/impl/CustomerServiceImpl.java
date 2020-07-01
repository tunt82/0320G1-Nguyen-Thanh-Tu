package furama_resort.services.impl;

import furama_resort.models.Customer;
import furama_resort.repositorys.CustomerRepository;
import furama_resort.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void saveCustomerById(Long id) {
      Customer cus=customerRepository.findById(id).orElse(null);
      cus.setDelete(true);
      cus.user.setIsDelete(true);
      customerRepository.save(cus);

    }

    @Override
    public void saveCustomer(Customer customer) {
        customer.setDelete(true);
        customer.user.setIsDelete(true);
        customerRepository.save(customer);
    }

    @Override
    public Page<Customer> findAllCustomer(Pageable pageable, String s, String type) {
        return customerRepository.findAllByIsDeleteIsTrueAndNameContainingAndTypeCustomerContaining(s,type,pageable);
    }

    @Override
    public void deleteCustomerById(Long id) {
        Customer customer=customerRepository.findById(id).orElse(null);
        if(customer!=null){
            customer.setDelete(false);
            customer.user.setIsDelete(false);
            customerRepository.save(customer);
        }
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Page<Customer> findAllCustomerUseService(Date s, Date e, Pageable pageable) {
        return customerRepository.findAllByContractCreateContractDay_CreateContractDayBetween(s,e,pageable);
    }
}
