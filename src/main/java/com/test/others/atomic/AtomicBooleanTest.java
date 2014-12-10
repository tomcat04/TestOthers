/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.others.atomic;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 *
 * @author cgx1844568
 */
public class AtomicBooleanTest {

    /**
     * 主要方法：
     *
     * @see AtomicBoolean#compareAndSet(boolean, boolean)
     * 第一个参数为原始值，第二个参数为要修改的新值，若修改成功则返回true，否则返回false
     * @see AtomicBoolean#getAndSet(boolean) 尝试设置新的boolean值，直到成功为止，返回设置前的数据
     */
    public final static AtomicBoolean TEST_BOOLEAN = new AtomicBoolean();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread() {
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("" + Thread.currentThread().getName());
                    if (TEST_BOOLEAN.compareAndSet(false, true)) {
                        System.out.println("我成功了！" + Thread.currentThread().getName());
                    }
                }
            }.start();
        }
    }
}
