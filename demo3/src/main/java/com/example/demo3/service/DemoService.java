package com.example.demo3.service;

import com.example.demo3.model.Employee;

import java.util.Optional;

public interface DemoService {

    public abstract Employee getEmployee(String id);
}
