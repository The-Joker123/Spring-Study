package com.zeng.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    private Subject subject;

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

//生成代理类，重点是第二个参数，获取要代理的抽象角色！之前都是一个角色，现在可以代理一类角色
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),subject.getClass().getInterfaces(),this);
    }
//处理代理实例上的方法调用并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result =method.invoke(subject,args);
        return null;
    }

}
