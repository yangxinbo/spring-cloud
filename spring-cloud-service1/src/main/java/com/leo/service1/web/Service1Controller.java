package com.leo.service1.web;


import com.leo.service1.entity.User;
import com.leo.service1.service.Service1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
public class Service1Controller {

    @Autowired
    private Service1Service service1Service;

    @RequestMapping("/service1")
    public String service1(HttpServletRequest request, @RequestParam String name) {
        return service1Service.service1(name);
    }

    @RequestMapping("/service1User")
    public String service1User(@RequestBody User user) {
        return "user.id:" + user.getId() + "user.name:" + user.getName();
    }
}
