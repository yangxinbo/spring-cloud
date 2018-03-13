package com.leo.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

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
@EnableConfigServer
@SpringCloudApplication
public class ConfigApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigApplication.class).web(true).run(args);
    }
}
