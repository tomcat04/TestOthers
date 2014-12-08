/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.reflect;

/**
 *
 * @author cgx1844568
 * @date 2014-12-8
 * @time 11:48:12
 *
 */
public class CountOperatorImpl implements ICountOperator{

    @Override
    public void queryCount() {
        System.out.println("查询账号...");
    }

    @Override
    public void updateCount() {
        System.out.println("更新账号...");
    }

}
