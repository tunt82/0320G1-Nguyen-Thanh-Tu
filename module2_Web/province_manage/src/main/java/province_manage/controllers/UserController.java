package province_manage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import province_manage.model.Customer;
import province_manage.model.Login;
import province_manage.model.User;
import province_manage.repository.UserRepository;
import province_manage.service.CustomerService;
import province_manage.service.ProvinceService;
import province_manage.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
    @GetMapping("create")
    public ModelAndView showFormRegister(){
        ModelAndView modelAndView=new ModelAndView("user/register");
        modelAndView.addObject("user",new User());
        return modelAndView;
    }
    @Autowired
    UserService userService;
    @PostMapping("register")
    public ModelAndView saveUser(@Validated @ModelAttribute("user") User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            ModelAndView modelAndView=new ModelAndView("user/register");
            return modelAndView;
        }
        userService.saveUser(user);
        ModelAndView modelAndView = new ModelAndView("user/register");
        return modelAndView;
    }

    @GetMapping("province")
    public ModelAndView showFormLogin(){
        ModelAndView modelAndView=new ModelAndView("user/login");
        modelAndView.addObject("login",new Login());
        return modelAndView;
    }
    @Autowired
    ProvinceService provinceService;
    @PostMapping("/login")
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

    @GetMapping("list")
    public ModelAndView showListUser(@PageableDefault(value = 2) Pageable pageable){
        Page<User>listUser=userService.findAllUer(pageable);
        ModelAndView modelAndView=new ModelAndView("user/listUser");
        modelAndView.addObject("users",listUser);
        return modelAndView;
    }
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id, RedirectAttributes redirect){
        userService.deleteUserById(id);
        return "redirect:/user/list";
    }


//    @Autowired
//    private ProvinceService provinceService;
//    @GetMapping ("")
//    public String getAllProvince(Model model) {
//       List<Province> provinceList= provinceService.getAllProvince();
//       model.addAttribute("province",provinceList);
//       return "province/list";
//    }
}
