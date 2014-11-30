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
 * @time 10:04:00
 *
 */
public class Adapter extends Source implements Targetable{

    @Override
    public void method2() {
        System.out.println("Adapter.method2");
    }

}
