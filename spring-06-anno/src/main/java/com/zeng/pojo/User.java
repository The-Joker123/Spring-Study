package com.zeng.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class User {
    //属性注入
@Value("曾自喜")
    public String name;
}
