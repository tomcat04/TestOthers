/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.others.thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cgx1844568
 * @date 2014-11-24
 * @time 9:49:28
 *
 */
public class PrintThread extends Thread {

    private String name;
    private AtomicInteger threadNo;
    private int order;
    private int count = 0;

    public PrintThread(AtomicInteger threadNo ,String name, int order) {
        this.threadNo = threadNo;
        this.name = name;
        this.order = order;
    }

    @Override
    public void run() {
        while(true){
            synchronized (threadNo) {
                if (threadNo.get() % 3 == order) {
                    System.out.println(name + count + ":" + threadNo.get());
                    threadNo.set(threadNo.get() + 1);
                    threadNo.notifyAll();
                    count ++;
                    if(count == 10) break;
                } else {
                    try {
                        threadNo.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(PrintThread.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
}
