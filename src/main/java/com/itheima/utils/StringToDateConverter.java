package com.itheima.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class StringToDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        if (source==null){
            throw new RuntimeException("参数不能为空");
        }
        try {
            DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(source);
            return date;
        } catch (Exception e) {
            throw new RuntimeException("类型转换错误");
        }

    }
}
