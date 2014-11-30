/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.adapter;

/**
 *
 * @author cgx1844568
 * @date 2014-11-30
 * @time 10:23:59
 *
 */
public class SourceSub1 extends Wrapper2{

    @Override
    public void method1(){
        System.out.println("SourceSub1.method1");
    }
}
