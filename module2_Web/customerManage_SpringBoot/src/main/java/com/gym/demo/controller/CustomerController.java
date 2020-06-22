package com.gym.demo.controller;

import com.gym.demo.model.Customer;
import com.gym.demo.repository.CustomerRepository;
//import com.gym.demo.repository.impl.CustomerRepositoryImpl;
import com.gym.demo.repository.impl.CustomerRepositoryImpl;
import com.gym.demo.service.CustomerService;
import com.gym.demo.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
//    private CustomerRepository customerRepository;
//     CustomerService customerService=new CustomerServiceImpl();
    @GetMapping("/")
    public String show(Model model){
        List<Customer> cus=customerService.findAllCustomer();
        model.addAttribute("customers",cus);
        return "home";
    }
    @GetMapping("/customer/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("create","customer", new Customer());
//        modelAndView.addObject("customer", new Customer()); cũng như trên
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.saveCustomer(customer);

        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("message", "New customer created successfully");
        return modelAndView;
    }

}
