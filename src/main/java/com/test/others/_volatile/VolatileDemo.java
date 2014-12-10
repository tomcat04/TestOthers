/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.others._volatile;

import java.util.concurrent.CountDownLatch;

/**
 *
 * @author cgx1844568
 * @date 2014-12-9
 * @time 16:28:36
 *
 */
public class VolatileDemo {

    private static volatile int count;
    private static CountDownLatch countDownLatch = new CountDownLatch(100);
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {
            new Thread() {
                @Override
                public void run() {
                    increment();
                    countDownLatch.countDown();
                }
            }.start();
        }
        countDownLatch.await();
        System.out.println(count);
    }
    public synchronized static int increment(){
        return count ++;
    }
}
