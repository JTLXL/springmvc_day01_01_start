package com.jtl.controller;

import com.jtl.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

/**
 * @author JT.L
 * @date 2019/12/4 13:26:50
 * @description 常用的注解
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username) {
        System.out.println("execute testRequestParam...");
        System.out.println(username);
        return "success";
    }

    /**
     * 获取到请求体的内容
     *
     * @param body
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body) {
        System.out.println("execute testRequestBody...");
        System.out.println(body);
        return "success";
    }

    /**
     * PathVaribale注解
     *
     * @param id
     * @return
     */
    @RequestMapping("/testPathVariable/{pid}")
    public String testPathVariable(@PathVariable(name = "pid") String id) {
        System.out.println("execute testPathVariable...");
        System.out.println(id);
        return "success";
    }

    /**
     * 获取请求头的值
     *
     * @param header
     * @return
     */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header) {
        System.out.println("execute testRequestHeader...");
        System.out.println(header);
        return "success";
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue) {
        System.out.println("execute testCookieValue...");
        System.out.println(cookieValue);
        return "success";
    }

    /**
     * ModelAttribute注解
     *
     * @param user
     * @return
     */
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("u") User user) {
        System.out.println("execute testModelAttribute...");
        System.out.println(user);
        return "success";
    }

    @ModelAttribute
    public void showUser(String uname, Map<String, User> map) {
        System.out.println("execute showUser...");
        //通过用户名查询数据库（模拟）
        User user = new User();
        user.setUname("jtl");
        user.setAge(20);
        user.setDate(new Date());
        map.put("u", user);
    }

    /**
     * 该方法会先执行
     */
/*    @ModelAttribute
    public User showUser(String uname) {
        System.out.println("execute showUser...");
        //通过用户名查询数据库（模拟）
        User user = new User();
        user.setUname("jtl");
        user.setAge(20);
        user.setDate(new Date());
        return user;
    }*/
}
