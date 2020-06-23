package furama_resort.controllers;

import furama_resort.models.Customer;
import furama_resort.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @GetMapping("create-customer")
    public ModelAndView showFormCreatCustomer(){
        ModelAndView modelAndView=new ModelAndView("customer/createNewCustomerForm");
        modelAndView.addObject("customer",new Customer());
        return modelAndView;
    }
    @Autowired
    CustomerService customerService;
    @PostMapping("createNewCustomer")
    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.saveCustomer(customer);
        ModelAndView modelAndView=new ModelAndView("customer/createNewCustomerForm");
        return modelAndView;
    }
    @GetMapping("customerList")
    public ModelAndView showAllCustomer(@PageableDefault(value = 3)Pageable pageable){
        Page<Customer>customers= customerService.findAllCustomer(pageable);
        ModelAndView modelAndView=new ModelAndView("customer/customerList");
        modelAndView.addObject("customers",customers);
        return modelAndView;
    }

}
