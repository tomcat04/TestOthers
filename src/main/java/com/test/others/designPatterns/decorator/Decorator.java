/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.decorator;

/**
 *
 * @author cgx1844568
 * @date 2014-11-30
 * @time 10:34:26
 *
 */
public class Decorator implements Sourceable{

    private Sourceable source;
        
    public Decorator(Sourceable source){
        super();
        this.source = source;
    }
    
    @Override
    public void method() {
        System.out.println("before");
        source.method();
        System.out.println("after");
    }

}
