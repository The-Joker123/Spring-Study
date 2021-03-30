package com.zeng.demo03;

public class Test {
    public static void main(String[] args) {
        //真实角色
        RealSubject realSubject=new RealSubject();
        //代理实例的调用处理程序
         ProxyInvocationHandler pih =new ProxyInvocationHandler();
         pih.setSubject(realSubject);//将真实角色放置进去！
         Subject proxy=(Subject)pih.getProxy();//动态生产对应的代理类！
         proxy.Request();
         //动态代理就是代理接口
    }
}
