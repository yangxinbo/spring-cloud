package com.flash.servicehi.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {

    @RequestMapping("/sayHello")
    public String home(@RequestParam String name) {
        return "hi " + name + ",i am from port:";
    }
}
