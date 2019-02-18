package com.example.service1;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: 高希阳
 * @Date: 2019/2/14 14:01
 * @Description:SpringCloud开发学习总结（七）—— 声明式服务调用Feign（三）
 * https://www.cnblogs.com/king-brook/p/9566613.html
 */
@RestController
public class ComputeController {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Value("${server.port}")
    String port;

    @Autowired
    private Registration registration; // 服务注册

    @Autowired
    private DiscoveryClient client; // 服务发现客户端


    @GetMapping("/service1")
    public String service0() {
        return "service1 ";
    }

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

}
