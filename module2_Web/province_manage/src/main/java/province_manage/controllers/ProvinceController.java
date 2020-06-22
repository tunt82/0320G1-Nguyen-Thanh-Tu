package province_manage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import province_manage.model.Login;
import province_manage.model.User;
import province_manage.service.ProvinceService;
import province_manage.service.UserService;

@Controller
@RequestMapping("province")
public class ProvinceController {
    @GetMapping("")
    public ModelAndView showFormLogin(){
        ModelAndView modelAndView=new ModelAndView("user/login");
        modelAndView.addObject("login",new Login());
        return modelAndView;
    }
    @Autowired
    ProvinceService provinceService;
    @Autowired
    UserService userService;
    @PostMapping("home")
    public ModelAndView loginProvince(@ModelAttribute("login") Login login){
        User user=userService.checkLogin(login);
        if(user==null){
            ModelAndView modelAndView=new ModelAndView("user/register");
            return modelAndView;
        }
        ModelAndView modelAndView=new ModelAndView("province/list");
        modelAndView.addObject("province",provinceService.findAllProvince());
        return modelAndView;
    }
}
