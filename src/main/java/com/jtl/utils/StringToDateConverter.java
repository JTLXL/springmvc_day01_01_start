package com.jtl.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author JT.L
 * @date 2019/12/3 14:17:40
 * @description 把字符串转换成日期
 */
public class StringToDateConverter implements Converter<String, Date> {
    /**
     * @param source 传入进来的字符串
     * @return
     */
    @Override
    public Date convert(String source) {
        if (source == null) {
            throw new RuntimeException("请您传入数据.");
        }
        /*原来日期写2019-1-1转换是不成功的，只支持默认的2019/1/1*/
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            //把字符串转换日期
            return df.parse(source);
        } catch (Exception e) {
            throw new RuntimeException("数据类型转换出现错误.");
        }
    }
}
