package com.example.demo3.controller;

import com.example.demo3.model.Employee;
import com.example.demo3.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/leads")
public class Demo3Controller {

    @Autowired
    DemoService demoService;

    @GetMapping(value = "/greeting")
    public String sayHi() {
        return "Hi Dan";
    }

    @GetMapping(value = "/{empId}")
    public Employee getEmployee(@PathVariable("empId") String id) {
        return demoService.getEmployee(id);
    }
}
