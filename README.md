# spring-cloud
## 1、注册中心 spring-cloud-eureka
    通过@EnableEurekaServer注解启动一个服务注册中心提供给其他应用进行对话。 
## 2、服务提供者 spring-cloud-service-hi  
    通过加上@EnableDiscoveryClient注解，该注解能激活Eureka中的DiscoveryClient实现，这样才能实现Controller中对服务信息的输出。
## 3、服务消费者 spring-cloud-serice-feign
    @EnableDiscoveryClient 注解用来将当前应用加入到服务治理体系中。
## 4、服务消费者-熔断 spring-cloud-consumer-feign-hystrix
    1、yml配置启动熔断
    feign:
      hystrix:
        enabled: true
    2、增加fallback配置
    @FeignClient(value = "xxx", fallback = Fallback.class) 
    