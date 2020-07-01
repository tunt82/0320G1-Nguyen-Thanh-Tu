package furama_resort.controllers;

import furama_resort.models.Contract;
import furama_resort.models.Customer;
import furama_resort.services.ContractService;
import furama_resort.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.sql.Date;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("create-customer")
    public ModelAndView showFormCreatCustomer(){
        ModelAndView modelAndView=new ModelAndView("customer/createNewCustomerForm");
       modelAndView.addObject("customer",new Customer());
        return modelAndView;
    }

    @PostMapping("createNewCustomer")
    public String saveCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult, RedirectAttributes redirect){
        if (bindingResult.hasErrors()){
            return "customer/createNewCustomerForm";
        }else {
        customerService.saveCustomer(customer);
        redirect.addFlashAttribute("message","Create new customer successfully");
        return "redirect:/customer/customerList";
        }
    }

    @GetMapping("customerList")
    public ModelAndView showAllCustomer(@PageableDefault(value = 4) Pageable pageable,
                                        @RequestParam(value = "s",defaultValue = "") String s,
                                        @RequestParam(value = "type",defaultValue = "") String type){
//        if(s==null && type==null){
//            s= "";
//            type="";
//        }
        Page<Customer>listCustomer= customerService.findAllCustomer(pageable,s,type);
        ModelAndView modelAndView=new ModelAndView("/customer/customerList");
        modelAndView.addObject("customers",listCustomer);
        modelAndView.addObject("s",s);
        modelAndView.addObject("type",type);
        return modelAndView;
    }
//    @GetMapping("deleteCustomer/{id}")
//    public String deleteCustomer(@PathVariable("id") Long id, RedirectAttributes redirect){
//        customerService.deleteCustomerById(id);
//        return "redirect:/customer/customerList";
//    }
    @GetMapping("deleteCustomer/{id}")
    public String confirmDelete(@PathVariable("id") Long id, Model model){
        model.addAttribute("customer",customerService.findCustomerById(id));
        return "customer/deleteCustomer";

    }

    @PostMapping("delete/{id}")
    public String deleteCustomer(@PathVariable("id") Long id, RedirectAttributes redirect){
        customerService.deleteCustomerById(id);
        return "redirect:/customer/customerList";
    }

    @GetMapping("editCustomer/{id}")
    public ModelAndView showFormEditCustomer(@PathVariable("id") Long id){
        ModelAndView modelAndView=new ModelAndView("customer/editCustomerForm");
        modelAndView.addObject("customer",customerService.findCustomerById(id));
        return modelAndView;
    }
    @PostMapping("saveCustomer")
    public String editCustomer(@Valid @ModelAttribute("customer") Customer customer,BindingResult bindingResult, RedirectAttributes redirect){
//        Long id=customer.getId();
//        customerService.saveCustomerById(id);
        if(bindingResult.hasErrors()){
            return "customer/editCustomerForm";
        }else {customerService.saveCustomer(customer);
            redirect.addFlashAttribute("message","Edit customer successfully");
            return "redirect:/customer/customerList";
        }

    }

    @Autowired
    ContractService contractService;
    @GetMapping("serviceUsingCustomerList")
    public ModelAndView showAllCustomerUsingService(@PageableDefault(value = 4) Pageable pageable,
                                        @RequestParam(value = "start",required = false) Date s,
                                        @RequestParam(value = "end",required = false) Date e) {

        if (s == null && e == null) {
            s = new Date(120,05,01);
            e = new Date(System.currentTimeMillis());
            Page<Contract> listContract = contractService.findAllCustomerUsingServiceByTheEndContractDayBetween(s, e, pageable);
            ModelAndView modelAndView = new ModelAndView("/customer/serviceUsingCustomerList");
            modelAndView.addObject("contracts", listContract);
            modelAndView.addObject("start", s);
            modelAndView.addObject("end", e);
            return modelAndView;
        } else {
            Page<Contract> listContract = contractService.findAllCustomerUsingServiceByTheEndContractDayBetween(s, e, pageable);
            ModelAndView modelAndView = new ModelAndView("/customer/serviceUsingCustomerList");
            modelAndView.addObject("contracts", listContract);
            modelAndView.addObject("start", s);
            modelAndView.addObject("end", e);
            return modelAndView;
        }
    }
}
