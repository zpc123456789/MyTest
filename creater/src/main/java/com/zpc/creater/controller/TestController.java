package com.zpc.creater.controller;


import com.zpc.customer.aop.MyAnnotation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RequestMapping("/test")
@RestController
public class TestController {

    @PostMapping("/one")
    @MyAnnotation(value = "测试注解")
    public Object testOne(){
        return "hello test one";
    }

}
