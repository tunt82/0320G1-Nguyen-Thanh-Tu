package furama_resort.controllers;

import furama_resort.models.Contract;
import furama_resort.models.Customer;
import furama_resort.services.ContractService;
import furama_resort.services.CustomerService;
import furama_resort.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Controller
@RequestMapping("contract")
public class ContractController {
    @Autowired
    CustomerService customerService;
    @Autowired
    ServiceService serviceService;
    @GetMapping("create-contract")
    public ModelAndView showCreateNewContract(){
        ModelAndView modelAndView=new ModelAndView("contract/createNewContractForm");
        modelAndView.addObject("contract", new Contract());
        modelAndView.addObject("customerList",customerService.getAllCustomer());
        modelAndView.addObject("serviceList",serviceService.getAllService());
        return modelAndView;
    }


    @Autowired
    ContractService contractService;
    @PostMapping("createNewContract")
    public String createNewContract(@ModelAttribute("contract") Contract contract){
        contractService.saveContract(contract);
        return "contract/createNewContractForm";
    }

    @GetMapping("contractList")
    public ModelAndView showAllContract(@PageableDefault(value = 4) Pageable pageable,
                                        @RequestParam(value = "start",required = false) Date s,
                                        @RequestParam(value = "end",required = false) Date e)  {

        if(s==null && e==null){
            s=new Date(120,05,01);
            e=new Date(System.currentTimeMillis());
        }
        Page<Contract> listContract= contractService.findAllContract(pageable,s,e);
        ModelAndView modelAndView=new ModelAndView("contract/contractList");
        modelAndView.addObject("contracts",listContract);
        modelAndView.addObject("start",s);
        modelAndView.addObject("end",e);
        return modelAndView;}

    @GetMapping("deleteContract/{id}")
    public String deleteContract(@PathVariable("id") Long id, RedirectAttributes redirect){
        contractService.deleteContractById(id);
        return "redirect:/contract/contractList";
    }
    @GetMapping("editContract/{id}")
    public ModelAndView showFormEditContract(@PathVariable("id") Long id){
        ModelAndView modelAndView=new ModelAndView("/contract/editContractForm");
        modelAndView.addObject("contract",contractService.findContractById(id));
        modelAndView.addObject("customerList",customerService.getAllCustomer());
        modelAndView.addObject("serviceList",serviceService.getAllService());
        return modelAndView;
    }
    @PostMapping("saveContract")
    public String editContract(@ModelAttribute("contract") Contract contract, RedirectAttributes redirect){
        contractService.saveContract(contract);
        return "redirect:/contract/contractList";
    }



//    @GetMapping("contractList")
//    public ModelAndView showAllContract(@PageableDefault(value = 2) Pageable pageable,
//                                        @RequestParam(value = "s",defaultValue = "") String s,
//                                        @RequestParam(value = "type",defaultValue = "") String type){
//        Page<Contract> listContract= contractService.findAllContract(pageable,s,type);
//        ModelAndView modelAndView=new ModelAndView("contract/contractList");
//        modelAndView.addObject("contracts",listContract);
//        modelAndView.addObject("s",s);
//        modelAndView.addObject("type",type);
//        return modelAndView;
//    }


}
