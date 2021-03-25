package com.zeng.demo01;

public class Proxy implements Subject {
//代理
    RealSubject realSubject;
    public void Request() {
        if(realSubject==null){
            realSubject=new RealSubject();
        }
        realSubject.Request();
    }
    //测试贡献度
}
