/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.bridge;

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
public class MyBridgeTest {
    
    public MyBridgeTest() {
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
     * Test of method method, of class MyBridge.
     */
    @Test
    public void testMethod() {
        System.out.println("method");
        MyBridge instance = new MyBridge();
        //or Bridge instance = new MyBridge();
        
        Sourceable source1 = new SourceSub1();
        instance.setSource(source1);
        instance.method();
        
        Sourceable source2 = new SourceSub2();
        instance.setSource(source2);
        instance.method();
    }
    
}
