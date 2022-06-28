package com.example.servicespring2.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("spring")
public class ApiController {

    @GetMapping()
    public String test(){
        System.out.println("service-Spring 2");
        return "Hello~ service-Spring~2";
    }

    @GetMapping("/hello")
    public String test1(){
        System.out.println("service-Spring 2");
        return "Hello~ service-Spring~222";
    }
}
