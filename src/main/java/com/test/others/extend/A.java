/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.extend;

/**
 *
 * @author cgx1844568
 * @date 2014-11-24
 * @time 9:12:50
 *
 */
public class A {

    private final String s = "父类-变量";
    
    public A(){
        System.out.println("父类-构造函数" + s);
    }
    
    public void eat(){  
        System.out.println("Animal eat");  
    }  
    public void sleep(){  
        System.out.println("Animal sleep");  
    }  
    public void breathe(){  
        System.out.println("Animal breathe" + s); 
    }  
    
}
