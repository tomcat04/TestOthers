/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.designPatterns.my;

/**
 *
 * @author cgx1844568
 * @date 2014-12-1
 * @time 15:56:55
 *
 */
public class MyServiceImpl implements IMyService{

    /**
     * 创建一个需求,合理抛出需要处理的异常
     * 事务控制
     * @param formbean 
     */
    @Override
    public void createReq(MyFormbean formbean) {
        
        this.method1();
        
        //dao.insert();
    }
    
    private void method1(){
    }

}
