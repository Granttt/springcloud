package com.example.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @auther: 高希阳
 * @Date: 2019/2/18 17:14
 * @Description:
 * https://blog.csdn.net/forezp/article/details/69788938
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name){
        return restTemplate.getForObject("http://service-hsi3/hi?name="+name,String.class);
    }
}
