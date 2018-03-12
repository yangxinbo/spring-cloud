package com.leo.consumerfeignhystrix.fallback;

import com.leo.consumerfeignhystrix.service.SayHelloService;
import org.springframework.stereotype.Component;

@Component
public class SayHelloFallback implements SayHelloService {

    @Override
    public String sayHello(String name) {
        return "SayHelloFallback:" + name;
    }

}
