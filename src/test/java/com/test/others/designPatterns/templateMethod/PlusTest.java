/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.templateMethod;

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
public class PlusTest {
    
    public PlusTest() {
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
     * Test of calculate method, of class Plus.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        String exp = "8+7";
        AbstractCalculator instance = new Plus();
        //Plus instance = new Plus();
        int resule = instance.calculate(exp, "\\+");
        System.out.println("resule:" + resule);
    }
    
}
