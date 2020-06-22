package com.codegym.provincialmanagement.controllers;

import com.codegym.provincialmanagement.model.Customer;
import com.codegym.provincialmanagement.model.Province;
import com.codegym.provincialmanagement.services.CustomerServices;
import com.codegym.provincialmanagement.services.ProvinceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("customers")
public class CustomerControllers {
    @Autowired
    CustomerServices customerServices;

    @Autowired
    ProvinceServices provinceServices;

    @ModelAttribute("provinces")
    public Iterable<Province> provinces() {
        return provinceServices.findAll();
    }

    @GetMapping("")
    public ModelAndView listCustomer() {
        Iterable<Customer> customers = customerServices.findAllCustomer();
        return new ModelAndView("province/list", "customers", customers);
    }

    @GetMapping("/create-customer")
    public ModelAndView showCreateForm() {
        return new ModelAndView("customer/create","customer",new Customer());
    }

    @PostMapping("/create-save")
    public String saveCreateCustomer(Customer customer, RedirectAttributes redirectAttributes) {
        customerServices.saveCustomer(customer);
        redirectAttributes.addFlashAttribute("message2","Create New Customer SuccessFul !!!");
        return "redirect:/customers";
    }

    @GetMapping("edit-customer/{id}")
    public ModelAndView getEditCustomer(@PathVariable Long id) {
        return new ModelAndView("customer/edit","customer",customerServices.findByIdCustomer(id));
    }

    @PostMapping("/edit-customer")
    public String updateCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes) {
        customerServices.saveCustomer(customer);
        redirectAttributes.addFlashAttribute("message2","Edit Customer SuccessFul !!!");
        return "redirect:/customers";
    }

    @GetMapping("delete-customer/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        return new ModelAndView("customer/delete","customer",customerServices.findByIdCustomer(id));
    }

    @PostMapping("/delete-customer")
    public String deleteCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes) {
        customerServices.removeCustomer(customer.getId());
        redirectAttributes.addFlashAttribute("message", "Delete Customer SuccessFul !!!");
        return "redirect:/customers";
    }
}
