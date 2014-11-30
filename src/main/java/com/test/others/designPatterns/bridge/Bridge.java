/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.bridge;

/**
 *
 * @author cgx1844568
 * @date 2014-11-30
 * @time 10:51:26
 *
 */
public class Bridge {

    private Sourceable source;
    
    public void method(){
        source.method();
    }

    /**
     * 给出持有对象的setter&getter
     * @return 
     */
    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
    
}
