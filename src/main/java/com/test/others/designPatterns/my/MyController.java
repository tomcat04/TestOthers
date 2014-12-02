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
 * @time 15:28:26
 *
 */
public class MyController {

    public IMyService myService;
    
    public String ope1(){
        MyFormbean bean = new MyFormbean(MyOperationEnum.CREATE);
        IMyService myService = new MyServiceImpl();
        myService.createReq(bean);//调用唯一一个Service,处理异常
        return "SUCCESS";
    }
}
