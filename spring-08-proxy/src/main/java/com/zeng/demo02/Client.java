package com.zeng.demo02;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userServiceimpl=new UserServiceImpl();
        UserServiceProxy userServiceProxy=new UserServiceProxy();
        userServiceProxy.setUserServiceimpl(userServiceimpl);
        userServiceProxy.add();
        //改变原有代码是大忌，所以用代理模式
    }




}
