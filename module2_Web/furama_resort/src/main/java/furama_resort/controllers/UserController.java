package furama_resort.controllers;

import furama_resort.models.Customer;
import furama_resort.models.Login;
import furama_resort.models.User;
import furama_resort.repositorys.CustomerRepository;
import furama_resort.services.CustomerService;
import furama_resort.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("signIn")
    public ModelAndView showFormRegister(){
        ModelAndView modelAndView=new ModelAndView("user/register");
        modelAndView.addObject("customer",new Customer());
        return modelAndView;
    }
    @Autowired
    CustomerService customerService;
    @PostMapping("register")
    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.saveCustomer(customer);
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }

}
