package com.jtl.controller;

import com.jtl.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

/**
 * @author JT.L
 * @date 2019/12/4 13:26:50
 * @description 常用的注解
 */
@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"}) //把msg=陆星林又存入到session这个域对象中，request有session也有
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


    /**
     * SessionAttributes 注解
     *
     * @return
     */
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model) {
        System.out.println("execute testSessionAttributes...");
        //底层会存储到request域对象中，以后再也不用写request
        model.addAttribute("msg", "陆星林");
        return "success";
    }

    /**
     * 从session域中获取值
     *
     * @param modelMap
     * @return
     */
    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap) {
        System.out.println("execute getSessionAttributes...");
        //这里不能用Moder因为它是个接口没有get方法，真正运行的肯定是它的实现类ModelMap
        String msg = (String) modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }

    /**
     * 从session域中清除值
     *
     * @param status
     * @return
     */
    @RequestMapping("/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status) {
        System.out.println("execute delSessionAttributes...");
        //重置session对象
        status.setComplete();
        return "success";
    }
}
