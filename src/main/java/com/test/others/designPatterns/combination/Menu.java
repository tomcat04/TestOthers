/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.combination;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author cgx1844568
 * @date 2014-12-11
 * @time 14:09:42
 *
 */
public class Menu extends MenuComponent{
    
    private List<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;

    public Menu(String name,String description){
        this.name = name;
        this.description = description;
    }
    
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public void print() {
        System.out.println(name);
        System.out.println(description);
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
