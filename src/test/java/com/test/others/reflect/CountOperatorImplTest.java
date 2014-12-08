/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.reflect;

import java.util.logging.Level;
import java.util.logging.Logger;
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
public class CountOperatorImplTest {
    
    public CountOperatorImplTest() {
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
     * Test of queryCount method, of class CountOperatorImpl.
     */
    @Test
    public void testQueryCount() {
        try {
            Class cl = Class.forName("com.test.others.reflect.CountOperatorImpl");
            Class cl1 = Class.forName("com.test.others.reflect.CountOperatorImpl",false,this.getClass().getClassLoader());
            Class[] s = cl.getInterfaces();
            System.out.println("------------");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CountOperatorImplTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
