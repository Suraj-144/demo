package com.Test.demo_test.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/say")
public class SayHi {


    @GetMapping("/get")
    public String sayHi(){
        return "Hii";
    }
}
