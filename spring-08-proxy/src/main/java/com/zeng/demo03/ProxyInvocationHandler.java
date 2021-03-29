package com.zeng.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    private Subject subject;

    public void setSubject(Subject subject) {
        this.subject = subject;
    }


    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),subject.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result =method.invoke(subject,args);
        return null;
    }

}
