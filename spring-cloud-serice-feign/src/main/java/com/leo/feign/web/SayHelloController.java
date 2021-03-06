package com.leo.feign.web;


import com.leo.feign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping("/sayHello")
    public String home(@RequestParam String name) {
        return schedualServiceHi.sayHello(name);
    }
}
