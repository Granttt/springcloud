package com.example.sericefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *  第三篇: 服务消费者（Feign）(Finchley版本)
 *  https://blog.csdn.net/forezp/article/details/81040965
 *  Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。
 *  https://blog.csdn.net/longzhanpeng/article/details/81220772
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class SericeFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SericeFeignApplication.class, args);
    }

}
