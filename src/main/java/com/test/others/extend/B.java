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
 * @time 9:15:17
 *
 */
public class B extends A{

    private final String s = "子类-变量";
    
    public void B(){
        //super();
        System.out.println("B init" + s);
    }
    
    @Override
    public void breathe(){  
        System.out.println("B breathe" + s);  
    }
}
