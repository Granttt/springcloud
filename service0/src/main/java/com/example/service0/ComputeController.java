package com.example.service0;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Random;

/**
 * @auther: 高希阳
 * @Date: 2019/2/14 14:01
 * @Description:SpringCloud开发学习总结（七）—— 声明式服务调用Feign（三）
 * https://www.cnblogs.com/king-brook/p/9566613.html
 */
@RestController
public class ComputeController {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private Registration registration; // 服务注册

    @Autowired
    private DiscoveryClient client; // 服务发现客户端

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request) throws Exception {

        //测试超时
        int sleepTime = new Random().nextInt(3000);
        logger.info("sleepTime:"+sleepTime);
        Thread.sleep(sleepTime);
        logger.info(request.getRemoteAddr()+","+request.getLocalName()+","+registration.getServiceId()+","+serviceInstance().getServiceId());
        return "hello I am provider";
    }

    @RequestMapping("/hello1")
    public String hello(@RequestParam String name) {
        return "Hello "+name;
    }

    @GetMapping("/service0")
    public String service0() {
        return "service0 ";
    }
    /**
     * 获取当前服务的服务实例
     *第二次提交
     * @return ServiceInstance
     */
    public ServiceInstance serviceInstance() {
        List<ServiceInstance> list = client.getInstances(registration.getServiceId());
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
