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
 * @time 14:34:48
 *
 */
public class MenuItem extends MenuComponent{

    private String name;
    private String description;
    private boolean vegetarian;
    private double price;
    
    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
    
    @Override
    public void print() {
        System.out.print("  " + getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("    --" + getDescription());
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

}
