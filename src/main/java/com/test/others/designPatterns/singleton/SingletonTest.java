/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.singleton;

/**
 *
 * @author cgx1844568
 * @date 2014-11-30
 * @time 9:26:47
 *
 */
public class SingletonTest {

    private static SingletonTest st = null;
    
    private SingletonTest(){}
    
    public static SingletonTest getInstance(){
        if(st == null)
            st = new SingletonTest();
        return st;
    }
    /**
     * 方法上锁
     * @return 
     */
    public static synchronized SingletonTest getInstance1(){
        if(st == null)
            st = new SingletonTest();
        return st;
    }
    /**
     * 第一次访问时上锁
     * @return 
     */
    public static SingletonTest getInstance2(){
        if(st == null)
            synchronized(st){
                st = new SingletonTest();
            }
        return st;
    }
}
