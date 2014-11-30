/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.observer;

/**
 *
 * @author cgx1844568
 * @date 2014-11-30
 * @time 11:32:08
 *
 */
public class MySubject extends AbstractSubject{

    @Override
    public void operation() {
        System.out.println("MySubject.operation");
        super.notifyObservers();
    }

}
