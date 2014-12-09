/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.classloader;

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
        ClassLoader loader = NewMain.class.getClassLoader();
        while(loader != null){
            System.out.println(loader.toString());
            loader = loader.getParent();
        }
    }
    //运行结果
    //sun.misc.Launcher$AppClassLoader@1c0ec97
    //sun.misc.Launcher$ExtClassLoader@ecb281
    
}
