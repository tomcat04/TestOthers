/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.dtdl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author cgx1844568
 */
public class BookFacadeProxyTest {
    
    public BookFacadeProxyTest() {
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
     * Test of bind method, of class BookFacadeProxy.
     */
    @Test
    public void testBind() {
        System.out.println("bind");
        BookFacadeProxy proxy = new BookFacadeProxy();
        IBookFacade bookProxy = (IBookFacade)proxy.bind(new BookFacadeImpl());
        bookProxy.addBook();
        
        try {
            BookFacadeImpl bookProxy1 = (BookFacadeImpl) proxy.bind(new BookFacadeImpl());
            bookProxy1.addBook();
        } catch (ClassCastException e) {
            System.out.println("动态代理失败--类型转换异常");
        }
    }
    
}
