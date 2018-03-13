package com.leo.service1.service.impl;

import com.leo.service1.service.Service1Service;
import com.leo.service1.service.Service2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * FileName    : Service1ServiceImpl.java
 * Description :
 *
 * @author : Leo
 * @version : 1.0
 * Create Date : 2018/3/13 18:55
 * @Copyright : Sinaif Software Co.,Ltd.Rights Reserved
 * @Company : 海南新浪爱问普惠科技有限公司
 **/
@Service
public class Service1ServiceImpl implements Service1Service {

    @Autowired
    private Service2Service service2Service;

    @Override
    public String service1(String name) {
        String result = service2Service.service2(name);
        return result;
    }
}
