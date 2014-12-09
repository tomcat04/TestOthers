/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.classloader;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cgx1844568
 */
public class MyClassLoaderTest {
    
    public MyClassLoaderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findClass method, of class MyClassLoader.
     */
    @Test
    public void testFindClass() throws Exception {
        System.out.println("findClass");
        MyClassLoader instance = new MyClassLoader("D:\\mine\\TestOthers\\target\\classes");
        Class result = instance.findClass("com.test.others.singleton.SingletonTest");
        System.out.println("" + result.getName());
    }
}
