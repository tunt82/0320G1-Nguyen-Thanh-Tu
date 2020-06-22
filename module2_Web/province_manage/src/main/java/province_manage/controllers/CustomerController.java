package province_manage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import province_manage.model.Customer;
import province_manage.model.Login;
import province_manage.model.Province;
import province_manage.service.CustomerService;
import province_manage.service.ProvinceService;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    ProvinceService provinceService;
    @ModelAttribute("provinces")
    public Iterable<Province> provinces(){
        return provinceService.findAllProvince();
    }
    @GetMapping("")
    public ModelAndView showListCustomer(){
        ModelAndView modelAndView=new ModelAndView("customer/customerList");
        modelAndView.addObject("customers", customerService.findAllCustomer());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showFormCreateNewCustomer(){
        ModelAndView modelAndView=new ModelAndView("customer/createNewCustomer");
        modelAndView.addObject("customer", new Customer());
        Iterable<Province> province=provinces();
        modelAndView.addObject("provinces",province);
        return modelAndView;
    }
    @PostMapping("/create-customer")
    public String createNewCustomer(@ModelAttribute("customer") Customer customer){
        customerService.saveCustomer(customer);
        return "customer/createNewCustomer";
    }



}