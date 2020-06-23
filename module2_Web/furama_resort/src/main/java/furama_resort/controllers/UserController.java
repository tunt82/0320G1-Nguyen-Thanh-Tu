package furama_resort.controllers;

import furama_resort.models.Customer;
import furama_resort.models.Login;
import furama_resort.models.User;
import furama_resort.repositorys.CustomerRepository;
import furama_resort.services.CustomerService;
import furama_resort.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController {
    @GetMapping("signIn")
    public ModelAndView showFormRegister(){
        ModelAndView modelAndView=new ModelAndView("user/register");
        modelAndView.addObject("customer",new Customer());
        return modelAndView;
    }
    @Autowired
    CustomerService customerService;
    @PostMapping("register")
    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.saveCustomer(customer);
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }

//    @GetMapping("province")
//    public ModelAndView showFormLogin(){
//        ModelAndView modelAndView=new ModelAndView("user/login");
//        modelAndView.addObject("login",new Login());
//        return modelAndView;
//    }
//    @Autowired
//    ProvinceService provinceService;
//    @PostMapping("/login")
//    public ModelAndView loginProvince(@ModelAttribute("login") Login login){
//        User user=userService.checkLogin(login);
//        if(user==null){
//            ModelAndView modelAndView=new ModelAndView("user/register");
//            return modelAndView;
//        }
//        ModelAndView modelAndView=new ModelAndView("province/list");
//        modelAndView.addObject("province",provinceService.findAllProvince());
//        return modelAndView;
//    }


//    @GetMapping("list")
//    public ModelAndView showListUser(@PageableDefault(value = 2) Pageable pageable){
//        Page<User> listUser=userService.findAllUer(pageable);
//        ModelAndView modelAndView=new ModelAndView("user/listUser");
//        modelAndView.addObject("users",listUser);
//        return modelAndView;
//    }
//    @GetMapping("/delete/{id}")
//    public String deleteUser(@PathVariable("id") Long id, RedirectAttributes redirect){
//        userService.deleteUserById(id);
//        return "redirect:/user/list";
//    }


//    @Autowired
//    private ProvinceService provinceService;
//    @GetMapping ("")
//    public String getAllProvince(Model model) {
//       List<Province> provinceList= provinceService.getAllProvince();
//       model.addAttribute("province",provinceList);
//       return "province/list";
//    }
}
