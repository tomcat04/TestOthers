/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.extend;

/**
 *
 * @author cgx1844568
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B b1 = new B();
        A a = new B();
        
        a.breathe();
        a.eat();
        System.out.println("--------------------");
        B b = new B();
        //b.B();
        
        String s = "abcdefg";
        char c = s.charAt(6);
        System.out.println("ccc:" + c);
        
        int i=1; int j=i++; 
        if((i>++j)&&(i++==j)) {i+=j;System.out.println("---");} 
        System.out.println(i);
        
        char[] s1 = new char[1] ;
        System.out.println("s1[0]: " + s1[0]);
        char c1 = 0;
        System.out.println(c1);
        
        NewMain v = new NewMain();
    }
    
    class InnerClass {
        private String s = "kkk";
    }
}
