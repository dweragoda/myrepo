package com.example.demo3.service.impl;

import com.example.demo3.model.Employee;
import com.example.demo3.service.DemoService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class DemoServiceImpl implements DemoService {

    List<Employee> employeeList = Arrays.asList(
            new Employee("E100", "Dan", "SCC"),
            new Employee("E101", "Gok", "ASC"),
            new Employee("E102", "Thar", "RC"),
            new Employee("E103", "Loka", "PRC"),
            new Employee("E104", "Dam", "HCC")
    );


    @Override
    public Employee getEmployee(String id) {

        /*Employee emp =  employeeList.stream()
                .filter(e -> id.equals(e.getId()))
                .findAny()
                .orElse(null);*/
        return employeeList.stream()
                .filter(e -> id.equals(e.getId()))
                .findFirst()
                .orElse(null);

    }
}
