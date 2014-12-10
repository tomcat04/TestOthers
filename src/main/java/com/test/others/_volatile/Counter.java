/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.others._volatile;

/**
 *
 * @author cgx1844568
 * @date 2014-12-9
 * @time 16:16:56
 *
 */
public class Counter {

    public static int count = 0;

    public static void inc() {
        //这里延迟1毫秒，使得结果明显
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
        count++;
    }

    public static void main(String[] args) {
        //同时启动1000个线程，去进行i++计算，看看实际结果
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Counter.inc();
                }
            }).start();
        }
        //这里每次运行的值都有可能不同,可能为1000
        System.out.println("运行结果:Counter.count=" + Counter.count);
    }
}
