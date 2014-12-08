/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.dtdl;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.MethodProxy;
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
public class BookFacadeProxyNewTest {
    
    public BookFacadeProxyNewTest() {
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
     * Test of getInstance method, of class BookFacadeProxyNew.
     */
    @Test
    public void testGetInstance() {
        BookFacadeCglib cglib = new BookFacadeCglib();
        BookFacadeImpl bookCglib = (BookFacadeImpl)cglib.getInstance(new BookFacadeImpl());
        bookCglib.addBook();
    }
}
