package com.leo.service2.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {

    @RequestMapping("/service2")
    public String service2(@RequestParam String name) {
        return "hi " + name + " i am from service2";
    }
}
