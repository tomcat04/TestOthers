/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.templateMethod;

/**
 *
 * @author cgx1844568
 * @date 2014-11-30
 * @time 11:14:25
 *
 */
public abstract class AbstractCalculator {

    public int calculate(String exp,String opt){
        int array[] = split(exp,opt);
        return calculate(array[0],array[1]);
    }
    /*被子类重写的方法*/  
    abstract public int calculate(int num1,int num2);  
    
    public int[] split(String exp,String opt){  
        String array[] = exp.split(opt);  
        int arrayInt[] = new int[2];  
        arrayInt[0] = Integer.parseInt(array[0]);  
        arrayInt[1] = Integer.parseInt(array[1]);  
        return arrayInt;  
    }  
}
