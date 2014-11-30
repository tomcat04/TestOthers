/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.adapter;

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
public class Wrapper2Test {
    
    public Wrapper2Test() {
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
     * Test of method1 method, of class Wrapper2.
     */
    @Test
    public void testMethod1() {
        System.out.println("method1");
        Wrapper2 instance1 = new SourceSub1();
        Wrapper2 instance2 = new SourceSub2();
        instance1.method1();
        instance1.method2();
        instance2.method1();
        instance2.method2();
    }
}
