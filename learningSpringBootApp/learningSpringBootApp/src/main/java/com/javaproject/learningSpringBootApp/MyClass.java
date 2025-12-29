package com.javaproject.learningSpringBootApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {


    @GetMapping("abc")
    public String sayHello(){
        String str = "Helo";
        return str;
    }
}
