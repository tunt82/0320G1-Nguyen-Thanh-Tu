package furama_resort.controllers;

import furama_resort.models.Customer;
import furama_resort.models.Quantity;
import furama_resort.models.RentType;
import furama_resort.models.Service;
import furama_resort.services.ContractService;
import furama_resort.services.RentTypeService;
import furama_resort.services.ServiceService;
import furama_resort.services.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

@Controller
@SessionAttributes("bookingService")
@RequestMapping("service")
public class ServiceController {
    @ModelAttribute("bookingService")
    public Map<Service, Quantity> bookService(){
        Map<Service,Quantity> bookService=new HashMap<>();
        return bookService;
    }


    @Autowired
    RentTypeService rentTypeService;
    @Autowired
    ServiceTypeService serviceTypeService;
    @GetMapping("/create")
    public ModelAndView showFormCreatService(){
        ModelAndView modelAndView=new ModelAndView("service/createNewServiceForm");
        modelAndView.addObject("service",new Service());
        modelAndView.addObject("rentTypeList",rentTypeService.getAllRentType());
        modelAndView.addObject("serviceTypeList", serviceTypeService.getAllServiceType());


        return modelAndView;
    }

    @PostMapping("/createNewService")
    public String createNewService(@ModelAttribute("service") Service service, RedirectAttributes redirect){
        serviceService.saveService(service);
        return "redirect:/service/serviceList";
    }

    @Autowired
    ServiceService serviceService;
    @GetMapping("/serviceList")
    public ModelAndView showAllService(@PageableDefault(value = 4) Pageable pageable,
                                       @RequestParam(value = "s",defaultValue = "") String s,
                                       @RequestParam(value = "type",defaultValue = "") String type){
//        if(s==null && type==null){
//            s= "";
//            type="";
//        }
        Page<Service> listService= serviceService.findAllService(pageable,s,type);
        ModelAndView modelAndView=new ModelAndView("service/serviceList");
        modelAndView.addObject("services",listService);
        modelAndView.addObject("s",s);
        modelAndView.addObject("type",type);
        return modelAndView;
    }


    @GetMapping("/bookingService")
    public ModelAndView showServiceList(){
        ModelAndView modelAndView=new ModelAndView("/service/bookServiceList");
        modelAndView.addObject("services",serviceService.getAllService());
        return modelAndView;
    }

    @GetMapping("/booking/{id}")
    public ModelAndView bookingService(@PathVariable("id") Long id, @ModelAttribute("bookingService") Map<Service,Quantity>bookService){
        serviceService.findById(id,bookService);
        ModelAndView modelAndView= new ModelAndView("/service/bookServiceList","services",serviceService.getAllService());
       modelAndView.addObject("message","thành công") ;
       return  modelAndView;
//        return "redirect:/service/bookService";
    }

}
