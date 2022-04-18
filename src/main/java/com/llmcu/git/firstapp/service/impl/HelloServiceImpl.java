package com.llmcu.git.firstapp.service.impl;

import com.llmcu.git.firstapp.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author llmcu
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "Hello World!!";
    }
}
