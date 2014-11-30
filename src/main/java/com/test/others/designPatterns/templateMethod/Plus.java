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
 * @time 11:16:29
 *
 */
public class Plus extends AbstractCalculator{

    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }

}
