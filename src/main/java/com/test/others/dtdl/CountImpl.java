/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.dtdl;

/**
 *
 * @author cgx1844568
 * @date 2014-12-8
 * @time 10:13:11
 *
 */
public class CountImpl implements ICount{

    @Override
    public void queryCount() {
        System.out.println("查看账户方法实现");
    }

    @Override
    public void updateCount() {
        System.out.println("修改账户方法实现");
    }

}
