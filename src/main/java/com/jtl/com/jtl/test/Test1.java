package com.jtl.com.jtl.test;

/**
 * @author JT.L
 * @date 2019/12/3 11:06:25
 * @description
 */
public class Test1 {
    public static void main(String[] args) {
        String s = "abc";
        String s1 = new String("abc");
        System.out.println(s1.intern()=="abc");
    }
}
