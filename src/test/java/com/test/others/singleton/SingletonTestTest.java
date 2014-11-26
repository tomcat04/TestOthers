/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.singleton;

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
public class SingletonTestTest {
    
    public SingletonTestTest() {
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
     * Test of getInstance method, of class SingletonTest.
     */
    @Test
    public void testGetInstance() {
        SingletonTest s = SingletonTest.getInstance();
        s.setName("hahah");
        SingletonTest s1 = SingletonTest.getInstance();
        s1.setName("heheh");
        s.printName();
        s1.printName();
    }
    
}
