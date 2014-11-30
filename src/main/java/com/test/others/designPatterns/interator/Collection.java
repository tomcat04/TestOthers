/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.interator;

/**
 *
 * @author cgx1844568
 */
public interface Collection {
    
    public Iterator iterator();
    
    public Object get(int i);
    
    public int size();
}
