/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.observer;

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
public class MySubjectTest {
    
    public MySubjectTest() {
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
     * Test of operation method, of class MySubject.
     */
    @Test
    public void testOperation() {
        Subject instance = new MySubject();
        instance.add(new Observer1());
        instance.add(new Observer2());
        instance.operation();
    }
    
}
