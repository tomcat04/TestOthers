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
 * @time 9:03:01
 *
 */
public class SenderFactory {

    /**
     * 简单工厂
     * @param clazz
     * @return 
     */
    public Sender produce(Class clazz){
        if(clazz.equals(MailSender.class)){
            return new MailSender();
        }else if(clazz.equals(SmsSender.class)){
            return new SmsSender();
        }else{
            System.out.println("找不到该类");
            return null;
        }
    }
    /**
     * 多个工厂(相比上面简单工厂,将参数用方法名确定)
     * @return 
     */
    public Sender produceMail(){
        return new MailSender();
    }
    public Sender produceSms(){
        return new SmsSender();
    }
}
