package com.leo.feign.web;

import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Random;

/**
 * FileName    : com.leo.feign.web.java
 * Description :
 *
 * @author : Leo
 * @version : 1.0
 * Create Date : 2018/3/14 11:41
 * @Copyright : Sinaif Software Co.,Ltd.Rights Reserved
 * @Company : 海南新浪爱问普惠科技有限公司
 **/
@RestController
public class LotteryController {

    public static void main(String[] args) {
        Double d = new Random().nextDouble();
        Double d2 = 2 / 10000.0;
        BigDecimal bigDecimal = new BigDecimal(d2);
        System.out.println("随机数:" + d);
        System.out.println("概率:" + bigDecimal.toString());
        System.out.println("中奖:" + (d <= 2 / 10000.0));
    }
}
