/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.interator;

/**
 *
 * @author cgx1844568
 * @date 2014-11-30
 * @time 11:47:57
 *
 */
public class MyCollection implements Collection{

    public String string[] = {"A","B","C","D","E"};
    
    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }

}
