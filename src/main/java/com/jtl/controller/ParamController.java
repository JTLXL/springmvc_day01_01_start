package com.jtl.controller;

import com.jtl.domain.Account;
import com.jtl.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author JT.L
 * @date 2019/12/2 19:38:01
 * @description 请求参数绑定
 */
@Controller
@RequestMapping("/param")
public class ParamController{

    @RequestMapping("/testParam")
    public String testParam(String username,String password) {
        System.out.println("execute testParam...");
        System.out.println("用户名："+username);
        System.out.println("密码："+password);
        return "success";
    }

    /**
     * 请求参数绑定 把数据封装到JavaBean的类中
     * @param account
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account) {
        System.out.println("execute saveAccount...");
        System.out.println(account);
        return "success";
    }

    /**
     * 自定义类型转换器 一般的数据类型MVC框架都帮我们做好了
     * @param user
     * @return
     */
    @RequestMapping("/saveUser")
    public String saveUser(User user) {
        System.out.println("execute saveUser...");
        System.out.println(user);
        return "success";
    }

    /**
     * 原生的Servlet AIP
     * @return
     */
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("execute testServlet...");
        System.out.println(req);
        HttpSession session = req.getSession();
        System.out.println(session);
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);
        System.out.println(resp);
        return "success";
    }


}
