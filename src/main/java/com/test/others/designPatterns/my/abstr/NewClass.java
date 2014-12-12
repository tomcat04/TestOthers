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
 * @time 15:16:28
 *
 */
public abstract class NewClass {

    public void fun1(){
        System.out.println("func1");
        func2();
        System.out.println("func2");
    }
    public abstract void func2();
}
