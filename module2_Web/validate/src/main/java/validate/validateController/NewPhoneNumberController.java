package validate.validateController;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import validate.model.NewPhoneNumber;

import javax.validation.Valid;
@Controller
public class NewPhoneNumberController {
    @GetMapping("/")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("phone-number", new NewPhoneNumber());
        return modelAndView;
    }
    @PostMapping("/validatePhone")
    public ModelAndView checkValidation(@Valid @ModelAttribute("user") NewPhoneNumber newPhoneNumber, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("index");
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("result");
        return modelAndView;
    }
}
