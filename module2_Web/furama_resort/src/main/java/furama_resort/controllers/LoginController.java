package furama_resort.controllers;

import furama_resort.models.Login;
import furama_resort.models.User;
import furama_resort.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("home")
@SessionAttributes("login")
public class LoginController {
//    @GetMapping("")
//    public ModelAndView showHome(){
//        ModelAndView modelAndView=new ModelAndView("home");
//        return modelAndView;
//    }

    @ModelAttribute("login")
    public Login setUpLoginForm() {
        return new Login();
    }
    @RequestMapping("logIn")
    public String Index(@CookieValue(value = "setLogin", defaultValue = "") String setLogin, Model model) {
        Cookie cookie = new Cookie("setLogin", setLogin);
        model.addAttribute("cookieValue", cookie);
        return "user/login";
    }
    @Autowired
    UserService userService;
    @RequestMapping("login")
    public String doLogin(@ModelAttribute("login") Login login, Model model, @CookieValue(value = "setLogin",defaultValue = "") String setLogin,
                          HttpServletResponse response, HttpServletRequest request) {
        User user = userService.checkLogin(login);
        if (user != null) {
            setLogin=user.getAccount();
            Cookie cookie=new Cookie("setLogin",setLogin);
            cookie.setMaxAge(24*60*60);
            response.addCookie(cookie);

            Cookie[] cookies=request.getCookies();
            for (Cookie ck:cookies){
                if(ck.getName().equals("setLogin")){
                    model.addAttribute("cookieValue",ck);
                    break;
                }else {
                    ck.setValue("");
                    model.addAttribute("cookieValue", ck);
                    break;
                }
            }
            model.addAttribute("message", "Login success. Welcome ");
        }else {
            user.setAccount("");
            Cookie cookie = new Cookie("setLogin", setLogin);
            model.addAttribute("cookieValue", cookie);
            model.addAttribute("message", "Login failed. Try again.");
        }
        return "home/home";
    }










//    @Autowired
//    UserService userService;
//    @GetMapping("logIn")
//    public ModelAndView showFormLogin(){
//        ModelAndView modelAndView=new ModelAndView("user/login");
//        modelAndView.addObject("login",new Login());
//        return modelAndView;
//    }
//    @PostMapping("login")
//    public ModelAndView showHomeMenu(@ModelAttribute("login") Login login){
//        User user=userService.checkLogin(login);
//        if(user!=null){
//            ModelAndView modelAndView=new ModelAndView("home");
//            return modelAndView;
//        }
//        ModelAndView modelAndView=new ModelAndView("user/login");
//        return modelAndView;
//
//        ModelAndView modelAndView=new ModelAndView("user/register");
//        return modelAndView;


}
