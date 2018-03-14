package com.leo.feign.web;

import com.leo.feign.entity.User;
import com.leo.feign.remote.Service1Remote;
import feign.QueryMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName    : com.leo.feign.web.java
 * Description :
 *
 * @author : Leo
 * @version : 1.0
 * Create Date : 2018/3/13 20:01
 * @Copyright : Sinaif Software Co.,Ltd.Rights Reserved
 * @Company : 海南新浪爱问普惠科技有限公司
 **/
@RestController
public class Service1Controller {

    @Autowired
    private Service1Remote service1Remote;

    @RequestMapping("service1")
    public String service1(String name) {
        return service1Remote.service(name);
    }

    @RequestMapping("service1User")
    public String service1User(@RequestBody User user) {
        return service1Remote.service1User(user);
    }
}
