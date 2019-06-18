package com.example.demo3.service;

import com.example.demo3.service.impl.DemoServiceImpl;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestDemoService {

    @InjectMocks
    DemoServiceImpl demoService;


}
