package com.llmcu.git.firstapp.service.impl;

import com.llmcu.git.firstapp.service.HelloService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author llmcu
 */
@Service
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello() {
        new ArrayList<>();
        System.out.println("Hello World!");
        return "Hello World!!";
    }
}
