package com.leo.consumerfeignhystrix.service;


import com.leo.consumerfeignhystrix.fallback.SayHelloFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-service-hi", fallback = SayHelloFallback.class)
public interface SayHelloService {

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name") String name);

}
