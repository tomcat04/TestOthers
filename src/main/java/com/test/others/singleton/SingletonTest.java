/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.singleton;

/**
 *
 * @author cgx1844568
 * @date 2014-11-26
 * @time 8:40:25
 *
 */
public class SingletonTest {

    public String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    private SingletonTest(){}
    
    private static SingletonTest ts1 = null;
    
    public static SingletonTest getInstance(){
        if(ts1 == null){
            ts1 = new SingletonTest();
        }
        return ts1;
    }
    
    public void printName(){
        System.out.println("name is :" + name);
    }
}
