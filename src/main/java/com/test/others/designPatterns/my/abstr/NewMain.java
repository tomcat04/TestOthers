/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.my.abstr;

/**
 *
 * @author cgx1844568
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewClass nc = new SubClass1();
        nc.fun1();
        nc.func2();
        System.out.println("-------------");
    }
    
}
