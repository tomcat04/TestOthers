/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.others.collection.map;

import java.util.WeakHashMap;

/**
 *
 * @author cgx1844568
 */
public class TestWeakHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        WeakHashMap w = new WeakHashMap();
        w.put("语文", "良好");
        w.put("数学", "及格");
        w.put("英语", "中等");
        w.put("java", "good");
        w.put("k", "o");
        w.put("ll", "iii");
        System.out.println(w);
        System.gc();
        System.gc();
        System.gc();
        System.gc();
        System.runFinalization();
        Thread.sleep(8000L);
        System.out.println(w);
    }

}
