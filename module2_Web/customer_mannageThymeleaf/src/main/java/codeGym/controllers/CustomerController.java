package codeGym.controllers;

import codeGym.models.Customer;
import codeGym.service.CustomerServive;
import codeGym.service.CustomerServiveImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {
    private CustomerServive customerService = new CustomerServiveImpl();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "home";
    }
    @GetMapping("/customer/create")
    public String createNewCustomer(Model model){
        model.addAttribute("customer",new Customer());
        return "create";
    }
    @GetMapping("/customer/save")
    public ModelAndView saveNewCustomer(@ModelAttribute("customer") Customer customer){
        customer.setId((int)(Math.random() * 10000));
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("create");
        return modelAndView;
    }
    @GetMapping("/customer/edit/{id}")
    public ModelAndView editCustomer(@PathVariable int id){
        Customer cus= customerService.findById(id);
        ModelAndView modelAndView=new ModelAndView("edit","customer",cus);
        return modelAndView;
    }
//    public String editCustomer(@PathVariable int id, Model model) {
//        Customer cus= customerService.findById(id);
//        model.addAttribute("customer",cus);
//        return "edit";
//    }
    @GetMapping("/customer/save/{id}")
    public String update(@PathVariable int id, @ModelAttribute("customer") Customer customer,RedirectAttributes redirectAttributes){
        customerService.update(id, customer);
        redirectAttributes.addFlashAttribute("message","Edit customer successfully");
        return "redirect:/";
    }
    @GetMapping("/customer/delete/{id}")
    public String deleteCustomer(@PathVariable int id, RedirectAttributes redirectAttributes){
        customerService.remove(id);
        redirectAttributes.addFlashAttribute("message", "Removed customer successfully");
        return "redirect:/";
    }

    @GetMapping("/customer/view/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "view";
    }


//    @GetMapping("/customer/create")
//    public String create(Model model) {
//        model.addAttribute("customer", new Customer());
//        return "create1";
//    }
//
//    @PostMapping("/customer/save")
//    public String save(Customer customer, RedirectAttributes redirect) {
//        customer.setId((int)(Math.random() * 10000));
//        customerService.save(customer);
//        redirect.addFlashAttribute("success", "Saved customer successfully!");
//        return "redirect:/";
//    }
}