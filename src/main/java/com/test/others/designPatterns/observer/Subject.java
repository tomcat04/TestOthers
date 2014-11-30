/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.observer;

/**
 *
 * @author cgx1844568
 */
public interface Subject {
    
    public void add(Observer observer);
    
    public void del(Observer observer);
    
    public void notifyObservers();
    
    public void operation();
}
