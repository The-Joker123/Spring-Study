package com.zeng.demo03;

public class Test {
    public static void main(String[] args) {
        RealSubject realSubject=new RealSubject();
         ProxyInvocationHandler pih =new ProxyInvocationHandler();
         pih.setSubject(realSubject);
         Subject proxy=(Subject)pih.getProxy();
         proxy.Request();
    }
}
