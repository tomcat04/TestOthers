/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.my.abstr;

/**
 *
 * @author cgx1844568
 * @date 2014-12-11
 * @time 15:17:34
 *
 */
public class SubClass1 extends NewClass{

    @Override
    public void func2() {
        System.out.println("subclass1.func2");
    }
    
    @Override
    public void fun1() {
        System.out.println("eeee");
        super.fun1();
        this.func2();
        System.out.println("subclass1.func2");
    }

}
