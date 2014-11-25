/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.thread;

import java.util.concurrent.atomic.AtomicInteger;

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
        AtomicInteger threadNo = new AtomicInteger(0);
        PrintThread a = new PrintThread(threadNo,"A",0);
        PrintThread b = new PrintThread(threadNo,"B",1);
        PrintThread c = new PrintThread(threadNo,"C",2);
        a.start();
        b.start();
        c.start();
    }
    
}
