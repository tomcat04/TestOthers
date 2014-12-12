/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.combination;

/**
 *
 * @author cgx1844568
 * @date 2014-12-11
 * @time 14:40:17
 *
 */
public class Waitress {

    MenuComponent allMenus;
    
    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }
    
    public void printMenu(){
        allMenus.print();
    }
}
