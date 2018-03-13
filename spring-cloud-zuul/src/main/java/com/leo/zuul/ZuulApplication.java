package com.leo.zuul;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * FileName    : .java
 * Description : 服务网关
 *
 * @author : Leo
 * @version : 1.0
 * Create Date : 2018/3/13 15:46
 * @Copyright : Sinaif Software Co.,Ltd.Rights Reserved
 * @Company : 海南新浪爱问普惠科技有限公司
 **/
@EnableZuulProxy
@SpringCloudApplication
public class ZuulApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
    }
}
