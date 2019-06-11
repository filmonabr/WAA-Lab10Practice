package edu.mum.cs.controller;

import edu.mum.cs.domain.Employee;
import edu.mum.cs.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.Clock;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/browse")
    public ModelAndView getAllEmployee(){
        ModelAndView mv = new ModelAndView();
        List<Employee> emp = employeeService.findAll();
        mv.addObject("employee", emp);
        mv.setViewName("employee-list");
        System.out.println("Employee Controller called ...");
        return mv;
    }

}
