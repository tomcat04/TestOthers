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
 * @time 11:47:32
 *
 */
public class MyIterator implements Iterator{

    private Collection collection;
    
    private int pos = -1;
    
    public MyIterator(Collection collection){
        this.collection = collection;
    }
    
    @Override
    public Object pre() {
        if(pos > 0)
            pos --;
        return collection.get(pos);
    }

    @Override
    public Object next() {
        if(pos < collection.size())
            pos ++;
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        return pos < collection.size() - 1;
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.get(pos);
    }

}
