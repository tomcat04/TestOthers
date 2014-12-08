/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.dtdl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * @author cgx1844568
 * @date 2014-12-8
 * @time 10:21:32
 *
 */
public class BookFacadeProxy implements InvocationHandler{

    private Object target;
    
    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        //getInterfaces标明JDK动态代理依赖接口,需要动态代理的类必须实现一个接口,否则无法动态代理
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("transaction begin.");
        Object result = method.invoke(target, args);
        System.out.println("transaction end.");
        return result;
    }

}
