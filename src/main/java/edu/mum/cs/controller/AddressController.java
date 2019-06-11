package edu.mum.cs.controller;

import edu.mum.cs.domain.Address;
import edu.mum.cs.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/browse")
    public ModelAndView getAllEmployee(){
        ModelAndView mv = new ModelAndView();
        Iterable<Address> addr = addressService.findAll();
        mv.addObject("address", addr);
        mv.setViewName("employee-list");
        return mv;
    }
}
