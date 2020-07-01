package com.example.ictemployee.controller;

import com.example.ictemployee.entity.Employee;
import com.example.ictemployee.repository.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    Employees employees;

    @RequestMapping(path = "/")
    public String index(Model model){
        List<Employee> employeeList = (List<Employee>) employees.findAll();
        model.addAttribute("listusers",employeeList);
        return "index";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveUser(Employee employee){
        employees.save(employee);
        return "redirect:/";
    }
    @RequestMapping(value = "/add")
    public String addUser(Model model){
        model.addAttribute("users1",new Employee());
        return "addEmployee";
    }

    @RequestMapping(path = "/search")
    public String searchByName(@RequestParam("name") String name, Model model){
        model.addAttribute("search",employees.findAllEmployees(name));
        return "index";
    }
}
