/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.bridge;

/**
 *
 * @author cgx1844568
 * @date 2014-11-30
 * @time 10:53:26
 *
 */
public class MyBridge extends Bridge{

    @Override
    public void method(){
        super.getSource().method();
    }
    
    public void method1(){
    }
}
