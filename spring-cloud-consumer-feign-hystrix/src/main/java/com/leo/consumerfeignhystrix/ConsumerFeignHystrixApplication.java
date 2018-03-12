package com.leo.consumerfeignhystrix;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


/**
 * 服务消费者
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class ConsumerFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignHystrixApplication.class, args);
    }
}
