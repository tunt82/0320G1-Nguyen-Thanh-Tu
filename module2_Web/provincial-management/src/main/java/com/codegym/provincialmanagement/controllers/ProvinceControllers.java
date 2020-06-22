package com.codegym.provincialmanagement.controllers;

import com.codegym.provincialmanagement.model.Province;
import com.codegym.provincialmanagement.services.ProvinceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProvinceControllers {
    @Autowired
    private ProvinceServices provinceServices;

    @GetMapping("/")
    public ModelAndView listProvinces() {
        Iterable<Province> provinces = provinceServices.findAll();
        return new ModelAndView("province/list", "provinces", provinces);
    }

    @GetMapping("/create-provinces")
    public ModelAndView showCreateForm() {
        return new ModelAndView("province/create","province",new Province());
    }

    @PostMapping("/create-save")
    public String saveCreateProvince(Province province, RedirectAttributes redirectAttributes) {
        provinceServices.save(province);
        redirectAttributes.addFlashAttribute("message", "Create New Province SuccessFul !!!");
        return "redirect:/";
    }

    @GetMapping("/edit-province/{id}")
    public ModelAndView getEditProvince(@PathVariable Long id) {
        return new ModelAndView("province/edit","province",provinceServices.findById(id));
    }

    @PostMapping("/edit-province")
    public String updateProvince(@ModelAttribute Province province, RedirectAttributes redirectAttributes) {
        provinceServices.save(province);
        redirectAttributes.addFlashAttribute("message", "Edit Province SuccessFul !!!");
        return "redirect:/";
    }

    @GetMapping("/delete-province/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        return new ModelAndView("province/delete","province",provinceServices.findById(id));
    }

    @PostMapping("/delete-province")
    public String deleteProvince(@ModelAttribute Province province, RedirectAttributes redirectAttributes) {
        provinceServices.remove(province.getId());
        redirectAttributes.addFlashAttribute("message", "Delete Province SuccessFul !!!");
        return "redirect:/";
    }
}
