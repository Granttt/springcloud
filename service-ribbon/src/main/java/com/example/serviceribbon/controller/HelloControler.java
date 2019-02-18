package com.example.serviceribbon.controller;

import com.example.serviceribbon.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: 高希阳
 * @Date: 2019/2/18 17:24
 * @Description:
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    /**
     * 在浏览器上多次访问http://localhost:8766/hi?name=forezp，
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
