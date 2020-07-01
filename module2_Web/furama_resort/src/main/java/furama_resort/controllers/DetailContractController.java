package furama_resort.controllers;

import furama_resort.models.DetailContract;
import furama_resort.services.DetailContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("detailContract")
public class DetailContractController {
    @Autowired
    DetailContractService detailContractService;
    @GetMapping("detailContractList")
    public ModelAndView showAllContract(@PageableDefault(value = 2) Pageable pageable){
        Page<DetailContract> listDetailContract= detailContractService.findAllDetailContract(pageable);
        ModelAndView modelAndView=new ModelAndView("detailContract/detailContractList");
        modelAndView.addObject("detailContractList",listDetailContract);
        return modelAndView;
    }
}
