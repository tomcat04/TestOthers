/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.adapter;

/**
 * 持有对象
 * @author cgx1844568
 * @date 2014-11-30
 * @time 10:06:11
 *
 */
public class Wrapper implements Targetable{

    private Source source;
    
    public Wrapper(Source source){
        super();
        this.source = source;
    }
    
    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("Wrapper.method2");
    }

}
