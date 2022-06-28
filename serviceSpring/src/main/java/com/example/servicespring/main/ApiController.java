package com.example.servicespring.main;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("spring")
public class ApiController {

    @GetMapping()
    public String test(){
        System.out.println("service-Spring 1");
        return "Hello~ service-Spring~1";
    }

    @GetMapping("/hello")
    public String test1(){
        System.out.println("service-Spring 1");
        return "Hello~ service-Spring~111";
    }
}
