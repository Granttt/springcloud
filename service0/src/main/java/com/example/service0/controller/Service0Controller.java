package com.example.service0.controller;

import org.apache.commons.lang.time.FastDateFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @auther: 高希阳
 * @Date: 2019/2/18 15:41
 * @Description:
 */
@RestController
public class Service0Controller {

    @GetMapping("test")
    String test(@PathVariable String value){
        return FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.sss").format(new Date());
    }
}
