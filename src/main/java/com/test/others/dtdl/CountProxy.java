/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.dtdl;

/**
 * CountImpl代理类(增强实现)
 * @author cgx1844568
 * @date 2014-12-8
 * @time 10:14:13
 *
 */
public class CountProxy implements ICount{

    private CountImpl countImpl;
    
    public CountProxy(CountImpl countImpl){
        this.countImpl = countImpl;
    }

    @Override
    public void queryCount() {
        System.out.println("transaction begin.");
        countImpl.queryCount();
        System.out.println("transaction end.");
    }

    @Override
    public void updateCount() {
        System.out.println("transaction begin.");
        countImpl.updateCount();
        System.out.println("transaction end.");
    }
    
    
}
