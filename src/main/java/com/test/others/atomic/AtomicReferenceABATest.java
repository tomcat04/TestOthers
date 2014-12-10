/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.others.atomic;

/**
 *
 * @author cgx1844568
 */
import java.util.concurrent.atomic.AtomicReference;

/**
 * ABA问题模拟，线程并发中，导致ABA问题，解决方案是使用|AtomicMarkableReference
 * 请参看相应的例子：AtomicStampedReferenceTest、AtomicMarkableReferenceTest
 *
 * @author zhongyin.xy
 *
 */
public class AtomicReferenceABATest {

    public final static AtomicReference<String> ATOMIC_REFERENCE = new AtomicReference<>("abc");

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            final int num = i;
            new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(Math.abs((int) (Math.random() * 100)));
                    } catch (InterruptedException e) {
                    }
                    if (ATOMIC_REFERENCE.compareAndSet("abc", "abc2")) {
                        System.out.println("我是线程：" + num + ",我获得了锁进行了对象修改！");
                    }
                }
            }.start();
        }
        new Thread() {
            @Override
            public void run() {
                while (!ATOMIC_REFERENCE.compareAndSet("abc2", "abc"));
                System.out.println("已经改为原始值！");
            }
        }.start();
    }
}
