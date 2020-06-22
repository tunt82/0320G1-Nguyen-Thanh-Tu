package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrenceConvert {
    @GetMapping("/convert")
    public String showForm(){
        return "index";
    }

    @GetMapping("/result")
    public String currenceConvert(@RequestParam String rate, @RequestParam String usd, Model model){
        double result = Float.parseFloat(rate)*Float.parseFloat(usd);
        model.addAttribute("result",result);
        return "result";
    }
}
