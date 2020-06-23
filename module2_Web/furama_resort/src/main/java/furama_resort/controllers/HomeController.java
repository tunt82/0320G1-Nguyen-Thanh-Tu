package furama_resort.controllers;

import furama_resort.models.Login;
import furama_resort.models.User;
import furama_resort.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("home")
public class HomeController {
    @GetMapping("")
    public ModelAndView showHome(){
        ModelAndView modelAndView=new ModelAndView("home");
        return modelAndView;
    }
    @Autowired
    UserService userService;
    @GetMapping("logIn")
    public ModelAndView showFormLogin(){
        ModelAndView modelAndView=new ModelAndView("user/login");
        modelAndView.addObject("login",new Login());
        return modelAndView;
    }
    @PostMapping("login")
    public ModelAndView showHomeMenu(@ModelAttribute("login") Login login){
        User user=userService.checkLogin(login);
        if(user!=null){
            ModelAndView modelAndView=new ModelAndView("home");
            return modelAndView;
        }
        ModelAndView modelAndView=new ModelAndView("user/login");
        return modelAndView;

//        ModelAndView modelAndView=new ModelAndView("user/register");
//        return modelAndView;
    }

}
