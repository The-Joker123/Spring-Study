package com.zeng.appconfig;

import com.zeng.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class zengconfig {
    //注册一个Bean,就相当于我们之前写的一个bean标签
    //这个方法的名字，就相当于bean标签的ID属性

    @Bean
    public User getUser(){
        //这个方法的返回值，就相当于bean标签中的class标签
        return new User();
    }

}
