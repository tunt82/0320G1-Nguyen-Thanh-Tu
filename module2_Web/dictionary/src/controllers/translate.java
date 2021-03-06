package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class translate {
    @GetMapping("/")
    public String showForm(){
       return "index";
    }

    @GetMapping("/translate")
    public String translate(@RequestParam String txtSearch, Model model){

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");
        if(dictionary.get(txtSearch)==null){
            model.addAttribute("message","Không có kết quả");
        }else {model.addAttribute("ketQua",dictionary.get(txtSearch));}

        return "result";
    }

}
