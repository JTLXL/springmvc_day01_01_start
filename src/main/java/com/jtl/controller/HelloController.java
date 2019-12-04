package com.jtl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author JT.L
 * @date 2019/12/2 14:26:58
 * @description
 */
//控制器类
@Controller
@RequestMapping(path = "/user")
public class HelloController {

    @RequestMapping(path = "/hello", params = {"username=jtl"},headers = {"Accept"})
    public String sayHello() {
        System.out.println("Hello SpringMVC.");
        /*mvc框架有个默认的规则，返回success表示默认当前jsp文件的名字*/
        return "success";
    }

    /**
     * RequestMapping注解
     *
     * @return
     */
    @RequestMapping(value = "/testRequestMapping", method = {RequestMethod.POST, RequestMethod.GET})
    public String testRequestMapping() {
        System.out.println("测试RequestMapping注解...");
        return "success";
    }
}
