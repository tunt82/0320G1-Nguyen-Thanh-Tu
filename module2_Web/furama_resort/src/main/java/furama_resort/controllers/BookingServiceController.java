package furama_resort.controllers;

import furama_resort.models.Quantity;
import furama_resort.models.Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("bookingService")
public class BookingServiceController {
    @GetMapping("/bookingResult")
    public ModelAndView getBookingService(@SessionAttribute("bookingService") Map<Service, Quantity> bookingService ){
        return new ModelAndView("service/bookingService","bookingService",bookingService);
    }
}
