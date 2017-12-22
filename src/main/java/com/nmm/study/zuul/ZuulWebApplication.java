package com.nmm.study.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @description zuul网关
 * @date 2017/12/20
 * @author Niemingming
 */
@EnableZuulProxy
@SpringBootApplication
public class ZuulWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulWebApplication.class,args);
    }
}
