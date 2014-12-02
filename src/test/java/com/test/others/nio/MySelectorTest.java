/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.nio;

import java.nio.channels.Selector;
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
public class MySelectorTest {
    
    public MySelectorTest() {
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
     * Test of initSelector method, of class MySelector.
     */
    @Test
    public void testInitSelector() throws Exception {
        System.out.println("initSelector");
        MySelector instance = new MySelector();
        Selector expResult = null;
        Selector result = instance.initSelector();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listen method, of class MySelector.
     */
    @Test
    public void testListen() throws Exception {
        System.out.println("listen");
        MySelector instance = new MySelector();
        instance.listen();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of process method, of class MySelector.
     */
    @Test
    public void testProcess() throws Exception {
        MySelector.acceptConnections(8077);
    }
    
}
