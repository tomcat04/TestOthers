/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.simpleFactory;

/**
 *
 * @author cgx1844568
 * @date 2014-11-30
 * @time 9:01:21
 *
 */
public class SmsSender implements Sender{

    @Override
    public void Send() {
        System.out.println("SmsSender");
    }
}
