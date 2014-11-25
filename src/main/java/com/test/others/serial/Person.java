/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.serial;

import java.io.Serializable;

/**
 *
 * @author cgx1844568
 * @date 2014-11-24
 * @time 8:43:52
 *
 */
public class Person implements Serializable{

    private String name;
    
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}
