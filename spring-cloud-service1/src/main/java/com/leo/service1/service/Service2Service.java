package com.leo.service1.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FileName    : .java
 * Description :
 *
 * @author : Leo
 * @version : 1.0
 * Create Date : 2018/3/13 18:08
 * @Copyright : Sinaif Software Co.,Ltd.Rights Reserved
 * @Company : 海南新浪爱问普惠科技有限公司
 **/
@FeignClient(value = "spring-cloud-service2")
public interface Service2Service {

    @RequestMapping(value = "/service2", method = RequestMethod.GET)
    String service2(@RequestParam(value = "name") String name);
}
