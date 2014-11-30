/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author cgx1844568
 * @date 2014-11-30
 * @time 11:29:53
 *
 */
public abstract class AbstractSubject implements Subject{

    private Vector<Observer> vector = new Vector<>();
    
    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();  
        while(enumo.hasMoreElements()){  
            enumo.nextElement().update();  
        }  
    }

}
