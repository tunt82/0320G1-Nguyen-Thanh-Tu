//package furama_resort.controllers;
//
//import furama_resort.models.Quantity;
//import furama_resort.models.Service;
//import furama_resort.services.ServiceService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Controller
//@SessionAttributes("bookingService")
//public class BookServiceController {
//    @ModelAttribute("bookingService")
//    public Map<Service, Quantity> bookService(){
//        Map<Service,Quantity> bookService=new HashMap<>();
//        return bookService;
//    }
//
//    @Autowired
//    ServiceService serviceService;
//    @GetMapping("bookService")
//    public ModelAndView showServiceList(){
//        ModelAndView modelAndView=new ModelAndView("/service/bookServiceList");
//        modelAndView.addObject("services",serviceService.getAllService());
//        return modelAndView;
//    }
//
//    @GetMapping("booking/{id}")
//    public String bookingService(@PathVariable("id") Long id, @SessionAttribute("bookingService") Map<Service,Quantity>bookService){
//        serviceService.findById(id,bookService);
//        return "redirect:bookService";
//    }
//}
